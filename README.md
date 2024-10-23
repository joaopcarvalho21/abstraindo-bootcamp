
# Sistema de Inscrição no Bootcamp Fullstack Developer

## Descrição do Projeto

Este projeto é uma simulação de um sistema de inscrição em Bootcamp para desenvolvedores. Ele permite que os usuários criem cursos, mentorias e gerenciem o progresso dos desenvolvedores através dos conteúdos do Bootcamp. O sistema acompanha os conteúdos inscritos, concluídos e calcula o total de XP (pontos de experiência) para cada desenvolvedor com base no seu progresso. O projeto implementa tratamento de exceções para garantir a integridade dos dados e tratar erros de entrada de usuário de forma adequada.

### Funcionalidades:
- Inscrição de desenvolvedores em Bootcamps.
- Inclusão de cursos e mentorias no Bootcamp.
- Progressão dos desenvolvedores pelos conteúdos e cálculo de XP total.
- Visualização do progresso dos desenvolvedores e listagem dos alunos inscritos.
- Tratamento de erros e exceções para uma melhor experiência do usuário.

## Tecnologias Utilizadas

- **Java 17**
- **Scanner** para manipulação de entrada de dados
- **Tratamento de Exceções** para interações robustas com o usuário
- **Princípios de Programação Orientada a Objetos (POO)**: encapsulamento, herança e polimorfismo
- **Coleções (Set e List)** para gerenciar os conteúdos e desenvolvedores inscritos no Bootcamp
- **Stream API (Java 8)** para processamento eficiente de dados (opcional)

## Como Funciona

1. O programa começa criando três cursos (`Curso`) e uma mentoria (`Mentoria`).
2. Um `Bootcamp` é criado, contendo os cursos e a mentoria.
3. Desenvolvedores (`Dev`) podem se inscrever no Bootcamp.
4. Cada desenvolvedor pode progredir pelos conteúdos do Bootcamp, ganhando pontos de experiência (XP) para cada curso ou mentoria concluída.
5. O sistema calcula o XP total de cada desenvolvedor e exibe os conteúdos restantes e os concluídos.
6. Todas as interações acontecem através da interface de linha de comando, utilizando o `Scanner` para entradas.
7. O tratamento de exceções é implementado para lidar com erros de entrada de usuário, como números inválidos ou tentativa de progresso em listas vazias.

## Tratamento de Exceções

- **`InputMismatchException`**: Garante que os usuários forneçam entradas numéricas válidas onde necessário.
- **`IllegalArgumentException`**: Impede lógicas inválidas, como progressão negativa ou números zero/negativos para o número de desenvolvedores.
- **`NoSuchElementException`**: Garante que os desenvolvedores não progridam por conteúdos quando nenhum conteúdo estiver disponível.
- **`Exception`**: Um tratamento geral para erros inesperados, garantindo que o programa não seja encerrado abruptamente.

## Estrutura do Projeto

```
src/
│
├── application/
│   └── Main.java
│
├── br/com/dio/desafio/dominio/
│   ├── Bootcamp.java
│   ├── Conteudo.java
│   ├── Curso.java
│   ├── Dev.java
│   └── Mentoria.java
```

### Classes:

- **Main**: Contém a lógica principal para interagir com o usuário, gerenciar as inscrições no Bootcamp e acompanhar o progresso dos desenvolvedores.
- **Bootcamp**: Armazena informações sobre o Bootcamp, incluindo a lista de desenvolvedores inscritos e os conteúdos disponíveis.
- **Conteudo** (abstract): Classe pai para `Curso` e `Mentoria`, que define o comportamento comum (como o cálculo de XP).
- **Curso**: Representa um curso com título, descrição e carga horária (em horas).
- **Mentoria**: Representa uma sessão de mentoria com uma data, além de título e descrição.
- **Dev**: Representa um desenvolvedor que pode se inscrever em Bootcamps, progredir pelos conteúdos e calcular seu XP total.

## Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/bootcamp-fullstack-developer-registration
   cd bootcamp-fullstack-developer-registration
   ```

2. Abra o projeto em sua IDE favorita (como IntelliJ IDEA ou Eclipse).

3. Execute a classe `Main.java`.

4. Siga as instruções no console para:
   - Inserir o número de desenvolvedores.
   - Inserir os nomes dos desenvolvedores.
   - Especificar quantos conteúdos cada desenvolvedor vai progredir.

5. O programa exibirá os conteúdos inscritos, concluídos e o total de XP para cada desenvolvedor. Também será exibida uma lista final de todos os desenvolvedores inscritos e seu progresso.

## Exemplo de Saída

```bash
Quantos alunos deseja inscrever no bootcamp?
2
Insira o nome do aluno 1:
Alice
Quantos conteúdos o aluno Alice vai progredir?
2
Conteúdos Inscritos Alice: [Curso JavaScript, Mentoria de Java]
Conteúdos Concluídos Alice: [Curso Java, Curso Spring Boot]
XP Total Alice: 180.0
Progresso Alice: 50%
-------
Insira o nome do aluno 2:
Bob
Quantos conteúdos o aluno Bob vai progredir?
3
Conteúdos Inscritos Bob: []
Conteúdos Concluídos Bob: [Curso Java, Curso JavaScript, Curso Spring Boot, Mentoria de Java]
XP Total Bob: 320.0
Progresso Bob: 100%
-------
Lista de alunos inscritos no Bootcamp:
Alice - Progresso: 50%
Bob - Progresso: 100%
```

---

# Bootcamp Fullstack Developer Registration

## Project Description

This project is a simulation of a Bootcamp registration system for developers. It allows users to create courses, mentorships, and manage developers' progress through various Bootcamp contents. The system tracks enrolled contents, completed contents, and calculates total XP (experience points) for each developer based on their progression. The project implements exception handling to ensure data integrity and handle user input errors gracefully.

### Features:
- Bootcamp registration for multiple developers.
- Enroll developers in courses and mentorships.
- Progress through Bootcamp contents and calculate total XP.
- View developer progress and list of enrolled students.
- Handle input errors and exceptions for better user experience.

## Technologies Used

- **Java 17**
- **Scanner** for input handling
- **Exception Handling** for robust user interaction
- **Object-Oriented Programming (OOP)** principles: encapsulation, inheritance, and polymorphism
- **Collections Framework** (Set and List) for managing Bootcamp contents and developers
- **Java 8 Stream API** (Optional) for efficient data processing

## How It Works

1. The program begins by creating three courses (`Curso`) and one mentorship (`Mentoria`).
2. A `Bootcamp` is created, containing the courses and mentorship.
3. Developers (`Dev`) can be enrolled in the Bootcamp.
4. Each developer can progress through the Bootcamp contents, gaining experience points (XP) for each completed course or mentorship.
5. The system calculates the total XP for each developer and displays their remaining enrolled and completed contents.
6. All interactions happen through the command-line interface using `Scanner` for input.
7. Exception handling is implemented to manage user input errors, like invalid numbers or progression through empty content lists.

## Exception Handling

- **`InputMismatchException`**: Ensures that users provide valid numerical input where required.
- **`IllegalArgumentException`**: Prevents invalid logic, such as negative progressions or zero/negative numbers for the number of developers.
- **`NoSuchElementException`**: Ensures that developers cannot progress through contents when none are left.
- **`Exception`**: A general catch-all for unexpected errors, ensuring that the program doesn't crash unexpectedly.

## Project Structure

```
src/
│
├── application/
│   └── Main.java
│
├── br/com/dio/desafio/dominio/
│   ├── Bootcamp.java
│   ├── Conteudo.java
│   ├── Curso.java
│   ├── Dev.java
│   └── Mentoria.java
```

### Classes:

- **Main**: Contains the main logic to interact with the user, manage bootcamp registration, and track developer progress.
- **Bootcamp**: Holds information about the bootcamp, including the list of enrolled developers and available contents.
- **Conteudo** (abstract): A parent class for `Curso` and `Mentoria` that defines common behavior (such as XP calculation).
- **Curso**: Represents a course with a title, description, and duration (in hours).
- **Mentoria**: Represents a mentorship session with a date, in addition to the title and description.
- **Dev**: Represents a developer who can enroll in bootcamps, progress through contents, and calculate their total XP.

## How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/bootcamp-fullstack-developer-registration
   cd bootcamp-fullstack-developer-registration
   ```

2. Open the project in your favorite IDE (such as IntelliJ IDEA or Eclipse).

3. Run the `Main.java` class.

4. Follow the prompts in the console to:
   - Enter the number of developers.
   - Enter developer names.
   - Specify how many contents each developer will progress through.

5. The program will display the enrolled contents, completed contents, and total XP for each developer. It will also show a final list of all enrolled developers and their progress.

## Example Output

```bash
Quantos alunos deseja inscrever no bootcamp?
2
Insira o nome do aluno 1:
Alice
Quantos conteúdos o aluno Alice vai progredir?
2
Conteúdos Inscritos Alice: [Curso JavaScript, Mentoria de Java]
Conteúdos Concluídos Alice: [Curso Java, Curso Spring Boot]
XP Total Alice: 180.0
Progresso Alice: 50%
-------
Insira o nome do aluno 2:
Bob
Quantos conteúdos o aluno Bob vai progredir?
3
Conteúdos Inscritos Bob: []
Conteúdos Concluídos Bob: [Curso Java, Curso JavaScript, Curso Spring Boot, Mentoria de Java]
XP Total Bob: 320.0
Progresso Bob: 100%
-------
Lista de alunos inscritos no Bootcamp:
Alice - Progresso: 50%
Bob - Progresso: 100%
```
