# Instruções de execução

1- Clone o repositório:
   git clone https://github.com/Ronaldo-Correia/Sistema-Legado--ADD-Padroes.git

2- Navegue até o diretório do projeto:    
   cd Sistema-Legado--ADD-Padroes

3- Execute o programa no arquivo 'main.java' ao clicar no botao "Run" na sua IDEA.


# Descrição dos padrões utilizados

Este sistema foi refatorado utilizando quatro padrões de projeto do catálogo GoF (Gang of Four), com o objetivo de torná-lo mais modular, reutilizável e fácil de manter.

1. Factory Method

Foi aplicado para desacoplar o SensorManager da criação concreta dos sensores.
Cada tipo de sensor possui sua própria classe fábrica (SensorTemperaturaFactory, etc.), que é responsável por instanciar sensores.
Isso facilita a adição de novos sensores no futuro sem modificar o gerenciador.

2. Singleton

Utilizado nos sensores (SensorTemperatura, SensorUmidade, SensorLuminosidade) para garantir que apenas uma instância de cada sensor exista no sistema.
Isso é especialmente importante em ambientes embarcados e IoT, onde o uso de memória e recursos deve ser controlado.

3. Adapter

O padrão Adapter foi aplicado para adaptar sensores legados à nova interface comum (Sensor), permitindo que sensores antigos possam ser integrados de forma padronizada.
Assim, o SensorManager consegue tratar qualquer sensor da mesma forma, mesmo que internamente a lógica seja diferente.

4. Decorator

Este padrão foi utilizado para adicionar comportamentos extras aos sensores de forma flexível e sem alterar seu código-fonte original.
Foram criados decoradores como:

`Log`: imprime no console o valor lido.

`Formatacao`: altera o formato da string de saída.

`VerificarLimite`: dispara alertas quando o valor do sensor excede um limite definido (por exemplo, temperatura > 50°C).

O uso de `SensorDecorator` garante flexibilidade, pois cada sensor pode ter diferentes comportamentos aplicados dinamicamente, conforme a necessidade do contexto.


# Explicação sobre ganhos de coesão e redução de acoplamento

Situação no código legado:
O sistema original apresentava alto acoplamento e baixa coesão:
- A classe `SensorManager` estava diretamente ligada a implementações concretas dos sensores (`SensorTemperatura`, `SensorUmidade`, `SensorLuminosidade`) e do display (`DisplayConsole`).
- Os sensores não compartilhavam uma interface comum, o que impossibilitava o uso polimórfico e tornava o código rígido e difícil de estender.
- A responsabilidade de leitura e exibição estava centralizada em uma única classe (`SensorManager`), violando o princípio da responsabilidade única (SRP).

Melhorias após refatoração:
Com a aplicação dos padrões de projeto, o sistema agora apresenta:
- Baixo acoplamento: o `SensorManager` depende apenas de interfaces (`Sensor`, `SensorFactory`, `Display`), permitindo maior flexibilidade e reutilização de componentes.
- Alta coesão: cada classe tem uma responsabilidade bem definida:
  - Fábricas criam sensores (`Factory Method`).
  - Sensores legados foram adaptados para uma interface comum (`Adapter`).
  - Novos comportamentos são adicionados separadamente (`Decorator`), sem alterar o sensor original.
  - O `DisplayConsole` implementa uma interface, permitindo trocar o tipo de saída (ex: console, arquivo, tela gráfica).

Benefícios práticos:
- Facilita a manutenção e extensão do sistema, pois novas funcionalidades (como sensores ou formatos de exibição) podem ser adicionadas sem alterar o código existente.
- Permite o uso de comportamentos personalizados (como logs, alertas e formatações) de maneira modular e reutilizável.
- Melhora a testabilidade, já que cada parte do sistema pode ser testada isoladamente com uso de mocks e stubs.