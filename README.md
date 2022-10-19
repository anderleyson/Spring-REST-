##### Injeção de Dependências é um tipo de Inversão de Controle e significa que uma classe não mais é responsável por criar ou buscar os objetos dos quais depende.

Isso serve para desacoplar as classes, evitando dependência direta entre elas.

Os resultados são:

    -Maior índice de reaproveitamento
    -Permite incluir novas funcionalidades sem alterar as já existentes
    -Possibilidade de criar mocks em testes unitários



### Exemplo

Vou ilustrar um caso simples de Injeção de Dependências sem necessidade de um container ou framework.
Suponha que você tem um sistema que processa pagamentos e implementa um método da seguinte forma:

`class Pagamento {

    void efetuarPagamento(String tipo, Integer codigo, Double valor) {
        if ("BOLETO".equals(tipo)) {
            new IntegracaoBoletoBanco().pagarBoleto(codigo, valor);
        } else if ("CARTAO".equals(tipo)) {
            new IntegracaoCartaoBanco().pagarCartao(codigo, valor);
        } else if ("DINHEIRO".equals(tipo)) {
            new IntegracaoContaBanco().pagarDinheiro(codigo, valor);
        }
    }

}`

Note que o método instancia diretamente várias classes. Isso é muito ruim porque o código fica todo acoplado e é necessário realizar manutenção sempre que alguma implementação mudar.

Podemos refatorar esse código de forma que o algoritmo fique mais genérico. Vejamos:

`class Pagamento {

    IntegracaoBanco integracaoBanco;

    public Pagamento(IntegracaoBanco integracaoBanco) {
        this.integracaoBanco = integracaoBanco;
    }

    void efetuarPagamento(Integer codigo, Double valor) {
        integracaoBanco.pagar(codigo, valor);
    }

}`

Aqui, IntegracaoBanco é uma interface e pode receber várias implementações. Além disso, classe agora exige que uma dessas implementações seja passada no construtor.

Nossa classe não tem mais a responsabilidade de conhecer as implementações de IntegracaoBanco. Quem vai chamá-la é quem deve passar a instância correta, injetando essa dependência no momento da criação da classe.

Dessa vez nosso código ficou muito mais simples e permite você criar novas implementações de pagamento através da interface ou estender as classes que já fazem parte do sistema sem mexer no código existente.




-------------------------------------------------------------------------------------------------------------------------
## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
