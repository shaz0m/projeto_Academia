ProjetoAcademia — Sistema de Gestão de Ginásio

UC: 00619 — Desenvolver aplicações em linguagem JAVA  
Formador:Rui Boticas  
Autor:Wendell  

---

Descrição do Problema

A gestão de um ginásio envolve o controlo de clientes, treinadores e aulas. Sem uma ferramenta adequada, esse processo torna-se desorganizado — é difícil saber quais aulas têm vagas, quais clientes estão inscritos, ou gerir quem entra no sistema.

O ProjetoAcademia resolve isso com uma aplicação desktop em Java que permite a um treinador gerir clientes e aulas, e a um cliente consultar e inscrever-se nas aulas disponíveis. O acesso é controlado por login, com perfis distintos para cada tipo de utilizador.

---

Arquitetura do Projeto

O projeto está organizado em camadas separadas:

| Camada | Package | Responsabilidade |
|--------|---------|-----------------|
| Apresentação | `presentation.ui.guii` | Janelas Swing (Login, Painéis, Formulários) |
| Persistência | `conexao` | Ligação à base de dados MySQL via JDBC |

A separação garante que a interface não depende diretamente da base de dados — a camada de persistência é acedida de forma isolada.

---

Ligação à Base de Dados

A ligação é feita através da classe `Conexao`, no package `conexao`, usando JDBC:

```java
public class Conexao {
    private static final String URL = "jdbc:mysql://localhost:3306/apdz0125_15_gestaoginasio";
    private static final String USER = "root";
    private static final String PASSWORD = "a tua password";

    public static Connection getConexao() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
```

Cada operação abre a ligação, executa a query e fecha. Não é usada uma ligação persistente global — cada método é responsável pela sua própria ligação.

---

Funcionalidades

Autenticação
- Login com username e password
- Deteção do tipo de utilizador (`cliente` ou `treinador`) e redirecionamento para o painel correto
- **Primeiro login obrigatório:** qualquer utilizador novo é forçado a alterar a senha antes de aceder à aplicação. O campo `primeiro_login` na tabela `utilizador` controla este comportamento — enquanto for `1`, o sistema redireciona para a janela de alteração de senha. Após a alteração, é atualizado para `0`

Treinador
- Ver todas as aulas (nome, data/hora, duração, vagas, inscritos, estado — *Disponível* ou *Lotada*)
- Adicionar nova aula (nome, data, hora, duração em minutos, capacidade máxima, treinador responsável)
- Remover aula (apaga também as inscrições associadas, respeitando a integridade referencial da BD)
- Ver todos os clientes registados (nome, email, telefone, número de inscrições)
- Adicionar novo cliente (cria um registo em `utilizador` e em `cliente`, com password padrão `1234`)
- Remover cliente (apaga também as inscrições associadas)

Cliente
- Ver aulas disponíveis
- Inscrever-se numa aula

---

Conceitos POO Aplicados

Encapsulamento 
Os atributos das classes são privados e acedidos apenas através dos métodos da própria classe. Por exemplo, `tblClientesRegistrados` em `PainelTreinador` só é alterada pelo método `carregarClientes()`.

Herança
As janelas da aplicação (`PainelTreinador`, `AdicionarAula`, `AdicionarCliente`, etc.) estendem `javax.swing.JFrame`, herdando o comportamento base de uma janela gráfica.

Exceções 
Todas as operações de base de dados estão dentro de blocos `try-catch` que tratam `SQLException`. Os erros são apresentados ao utilizador através de `JOptionPane`, sem deixar a aplicação crashar.

---

Base de Dados

Tabelas

| Tabela | Descrição |
|--------|-----------|
| `utilizador` | Dados de autenticação (username, password, tipo, primeiro_login) |
| `cliente` | Dados pessoais do cliente, ligado a `utilizador` |
| `treinador` | Dados do treinador e especialidade, ligado a `utilizador` |
| `aula` | Aulas criadas no ginásio, ligadas a um `treinador` |
| `inscricao` | Registo de inscrições — liga `cliente` a `aula` |

Relações principais
- `cliente` e `treinador` têm chave estrangeira para `utilizador`
- `aula` tem chave estrangeira para `treinador`
- `inscricao` tem chaves estrangeiras para `cliente` e `aula`

---

Instruções de Utilização

1. Executar a aplicação — abre a janela de Login
2. Introduzir username e password
3. Se for o primeiro acesso, o sistema obriga a alterar a senha
4. Após login, o sistema redireciona automaticamente:
   - **Treinador** → PainelTreinador (gestão de aulas e clientes)
   - **Cliente** → PainelCliente (consulta e inscrição em aulas)

Credenciais de teste disponíveis:**

| Username | Password | Tipo |
|----------|----------|------|
| treinador | 1234 | treinador |
| trainer2 | 1234 | treinador |
| joao | 1234 | cliente |
| maria | 1234 | cliente |
| ana | 1234 | cliente |

---

Considerações Importantes

O que ficou por implementar e porquê**

Duas funcionalidades estavam previstas mas foram removidas para não estender demasiado o projeto:

- Remoção de inscrição pelo cliente — o cliente não consegue cancelar a sua inscrição diretamente. Para isso tem de pedir ao treinador. A intenção original era o cliente ter essa autonomia.
- Alteração de senha pelo cliente após primeiro login — existe apenas para o primeiro acesso. Não foi estendida para uso regular.

Ambas estão identificadas como melhorias para versões futuras.

Escalabilidade 
O projeto foi desenvolvido com essa preocupação. A separação de camadas e a estrutura da base de dados permitem adicionar novas funcionalidades sem reescrever o que já existe.

---

Melhorias Futuras

- [ ] Cliente poder cancelar a sua inscrição
- [ ] Cliente poder alterar a senha após o primeiro login
- [ ] Estatísticas para o treinador
- [ ] Filtros e pesquisa nas tabelas
- [ ] Validação de campos nos formulários
