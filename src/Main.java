import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso JAVA");
        curso1.setDescricao("Descrição curso JAVA");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso GIT");
        curso2.setDescricao("Descrição curso Git/GitHub");
        curso2.setCargaHoraria(6);

        Curso curso3 = new Curso();
        curso2.setTitulo("Curso SQL");
        curso2.setDescricao("Descrição curso Banco de dados Relacional(SQL)");
        curso2.setCargaHoraria(10);

        Curso curso4 = new Curso();
        curso2.setTitulo("Curso Pensamento Computacional");
        curso2.setDescricao("Descrição curso Pensamento Computacional");
        curso2.setCargaHoraria(15);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de JAVA");
        mentoria.setDescricao("Descrição mentoria JAVA");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso3);
        bootcamp.getConteudos().add(curso4);
        bootcamp.getConteudos().add(mentoria);

        System.out.println("-------");

        Dev devTatiane = new Dev();
        devTatiane.setNome("Tatiane");
        devTatiane.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Tatiane:" + devTatiane.getConteudosInscritos());
        devTatiane.progredir();
        devTatiane.progredir();
        devTatiane.progredir();
        devTatiane.progredir();
        System.out.println("---- Após a evolução de 4 cursos realizados por Tatiane... ----");
        System.out.println("Conteúdos Inscritos Tatiane:" + devTatiane.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Tatiane:" + devTatiane.getConteudosConcluidos());
        System.out.println("XP:" + devTatiane.calcularTotalXp());

        System.out.println("-------");

        Dev devGabriel = new Dev();
        devGabriel.setNome("Gabriel");
        devGabriel.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Gabriel:" + devGabriel.getConteudosInscritos());
        devGabriel.progredir();
        devGabriel.progredir();
        System.out.println("---- Após a evolução de 2 cursos realizados por Gabriel... ----");
        System.out.println("Conteúdos Inscritos Gabriel:" + devGabriel.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Gabriel:" + devGabriel.getConteudosConcluidos());
        System.out.println("XP:" + devGabriel.calcularTotalXp());

    }

}
