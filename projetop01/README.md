Questao1. Classe e Objeto em Java:

Classe: Em Java, uma classe é uma estrutura que define o comportamento e os estados de um objeto. Ela serve como um modelo para a criação de objetos. Uma classe em Java contém campos (variáveis) e métodos (funções).

Objeto: Um objeto é uma instância de uma classe. Ele representa uma entidade do mundo real e possui características (campos) e comportamentos (métodos) definidos pela classe.

Aqui estão exemplos em C++ e Java:

C++:

cpp
Copy code
// Exemplo de classe em C++
class Car {
public:
    string brand;
    int year;
};

// Exemplo de objeto em C++
Car myCar;
myCar.brand = "Toyota";
myCar.year = 2022;
Java:

java
Copy code
// Exemplo de classe em Java
public class Car {
    public String brand;
    public int year;
}

// Exemplo de objeto em Java
Car myCar = new Car();
myCar.brand = "Toyota";
myCar.year = 2022;
Questao2. Declaração de Variáveis em Java:

Em Java, você declara uma variável da seguinte maneira:

java
Copy code
// Declaração de variável em Java
int myNumber = 10;
Os tipos de dados primitivos mais comuns em Java incluem int, double, float, char, boolean, etc.

Em C++, a declaração de variáveis é semelhante:

cpp
Copy code
// Declaração de variável em C++
int myNumber = 10;
Os tipos de dados primitivos em C++ são semelhantes aos de Java, incluindo int, double, float, char, bool, etc.

questao3. Herança em Java:

A herança em Java permite que uma classe (subclasse) herde os campos e métodos de outra classe (superclasse). Você pode criar uma subclasse usando a palavra-chave extends.

Java:

java
Copy code
// Exemplo de herança em Java
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}
C++:

cpp
Copy code
// Exemplo de herança em C++
class Animal {
public:
    void eat() {
        cout << "Animal is eating" << endl;
    }
};

class Dog : public Animal {
public:
    void bark() {
        cout << "Dog is barking" << endl;
    }
};
questao4. Ponteiros em Java e C++:

Em Java, você não lida diretamente com ponteiros como em C++. Em Java, os objetos são manipulados por referência, mas não há ponteiros explicitamente visíveis ou manipuláveis pelo programador.

Em C++, você lida diretamente com ponteiros, e a alocação de memória pode ser gerenciada manualmente usando new e delete. Isso pode levar a problemas como vazamentos de memória se não for tratado corretamente.

Java, por outro lado, possui um coletor de lixo que gerencia automaticamente a alocação e desalocação de memória, eliminando a necessidade de manipulação manual de ponteiros e reduzindo o risco de vazamentos de memória.





