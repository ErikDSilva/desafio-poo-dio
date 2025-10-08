import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Aprenda Java do zero");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Spring Boot");
        curso2.setDescricao("Aprenda Spring Boot e APIs REST");
        curso2.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Dicas e boas práticas em Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp voltado para o desenvolvimento Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devErik = new Dev();
        devErik.setNome("Erik Silva");
        devErik.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Erik: " + devErik.getConteudosInscritos());

        devErik.progredir();
        devErik.progredir();
        System.out.println("Conteúdos Concluídos de Erik: " + devErik.getConteudosConcluidos());
        System.out.println("XP Total: " + devErik.calcularTotalXp());

        Dev devThiago = new Dev();
        devThiago.setNome("Thiago Souza");
        devThiago.inscreverBootcamp(bootcamp);
        System.out.println("\nConteúdos Inscritos de Thiago: " + devThiago.getConteudosInscritos());

        devThiago.progredir();
        System.out.println("Conteúdos Concluídos de Thiago: " + devThiago.getConteudosConcluidos());
        System.out.println("XP Total: " + devThiago.calcularTotalXp());
    }
}
