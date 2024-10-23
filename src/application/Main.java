package application;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Aprendizado sobre Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Aprendizado sobre JavaScript");
        curso2.setCargaHoraria(4);

        Curso curso3 = new Curso();
        curso3.setTitulo("Curso Spring Boot");
        curso3.setDescricao("Aprendizado sobre Spring Boot");
        curso3.setCargaHoraria(10);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Mentoria focada em boas práticas de Java");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Fullstack Developer");
        bootcamp.setDescricao("Bootcamp focado em desenvolvimento Fullstack");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso3);
        bootcamp.getConteudos().add(mentoria1);

        List<Dev> devs = new ArrayList<>();

        try {
            System.out.println("Quantos alunos deseja inscrever no bootcamp?");
            int numDevs = scanner.nextInt();
            scanner.nextLine();

            if (numDevs <= 0) {
                throw new IllegalArgumentException("O número de alunos deve ser maior que zero.");
            }

            for (int i = 0; i < numDevs; i++) {
                System.out.println("Insira o nome do aluno " + (i + 1) + ":");
                String nomeDev = scanner.nextLine();

                Dev dev = new Dev();
                dev.setNome(nomeDev);
                dev.inscreverBootcamp(bootcamp);
                devs.add(dev);

                System.out.println("Quantos conteúdos o aluno " + nomeDev + " vai progredir?");
                int numConteudosProgredidos = scanner.nextInt();
                scanner.nextLine();

                if (numConteudosProgredidos < 0) {
                    throw new IllegalArgumentException("O número de conteúdos progredidos não pode ser negativo.");
                }

                for (int j = 0; j < numConteudosProgredidos; j++) {
                    dev.progredir();
                }

                System.out.println("Conteúdos Inscritos " + nomeDev + ": " + dev.getConteudosInscritos());
                System.out.println("Conteúdos Concluídos " + nomeDev + ": " + dev.getConteudosConcluidos());
                System.out.println("XP Total " + nomeDev + ": " + dev.calcularTotalXp());
                System.out.println("Progresso " + nomeDev + ": " + dev.calcularProgresso() + "%");
                System.out.println("-------");
            }

        } catch (InputMismatchException e) {
            System.err.println("Erro: Entrada inválida! Por favor, insira números onde for solicitado.");
            scanner.nextLine();

        } catch (IllegalArgumentException e) {
            System.err.println("Erro: " + e.getMessage());

        } catch (NoSuchElementException e) {
            System.err.println("Erro: Não há mais conteúdos para progredir!");

        } catch (Exception e) {
            System.err.println("Erro inesperado: " + e.getMessage());

        } finally {
            System.out.println("Lista de alunos inscritos no Bootcamp:");
            for (Dev dev : devs) {
                System.out.println(dev.getNome() + " - Progresso: " + dev.calcularProgresso() + "%");
            }
            scanner.close();
        }
    }
}