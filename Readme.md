# Atividade 03

**Questao 01 -O que é uma exceção em Java e qual é o propósito de usá-las em programas?**

* Em Java, uma exceção é um evento imprevisto que ocorre durante a execução de um programa e interrompe o fluxo normal de instruções. O propósito de usar exceções é lidar com situações excepcionais de maneira controlada, melhorando a robustez e a manutenibilidade do código. Em vez de interromper abruptamente a execução do programa, as exceções permitem que você trate erros de forma elegante, fornecendo informações sobre o que deu errado.

**Questão 02-Diferença entre exceções verificadas e não verificadas em Java:**

* Exceções verificadas: São aquelas que o compilador exige que sejam tratadas pelo programador, seja por meio de um bloco try-catch ou declarando a exceção na cláusula throws do método. Exemplos incluem IOException e SQLException.

* Exceções não verificadas: São exceções que o compilador não exige que sejam tratadas explicitamente. Normalmente, são subtipos de RuntimeException. Exemplos incluem NullPointerException e ArrayIndexOutOfBoundsException.

**Questão 03-Como lidar com exceções em Java:**

* Para lidar com exceções em Java, você pode usar as palavras-chave try, catch, finally e throw. O bloco try é usado para envolver o código que pode gerar uma exceção, o catch é usado para capturar e tratar exceções específicas, e o finally é usado para código que deve ser executado, independentemente de ocorrer ou não uma exceção.

**Quetao 04 - O que é o bloco "try-catch" em Java e por que é importante usá-lo ao lidar com exceções:**

* O bloco try-catch é usado para envolver código que pode lançar uma exceção, permitindo que você capture e trate a exceção de maneira controlada. Se uma exceção ocorre dentro do bloco try, o controle é transferido para o bloco catch correspondente, onde você pode fornecer instruções específicas para lidar com a exceção. É importante usar o try-catch para evitar que exceções não tratadas interrompam abruptamente a execução do programa.

**Questao 05 - Quando é apropriado criar suas próprias exceções personalizadas em Java e como fazer isso:**

* Você pode criar suas próprias exceções personalizadas quando os tipos de exceções padrão não são suficientes para representar de maneira adequada os problemas específicos do seu domínio. Isso permite que você forneça informações mais significativas sobre o erro. Para criar uma exceção personalizada, você geralmente estende a classe Exception (ou suas subclasses) e adiciona seus próprios atributos e métodos. Por exemplo, você pode criar uma exceção SaldoInsuficienteException em um sistema bancário para lidar com situações em que o saldo da conta é insuficiente.





