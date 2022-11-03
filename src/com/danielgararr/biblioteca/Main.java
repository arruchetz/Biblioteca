package com.danielgararr.biblioteca;

public class Main {
    public static void main(String[] args) {

        System.out.println("Iniciando...");


        Libro book = new Libro();

        book.setIsbn(1);
        book.setAutor("Antoine de Saint-Exupery");
        book.setTitulo("El Principito");
        book.setGenero("Novela Infantil");
        book.setFechapublicacion("6 de abril de 1943");

        System.out.println(book.getIsbn());
        System.out.println(book.getAutor());
        System.out.println(book.getTitulo());
        System.out.println(book.getGenero());
        System.out.println(book.getFechapublicacion());


        Autor author = new Autor();
        author.setNombre("Antoine");
        author.setApellido("Saint-Exupery");
        author.setLocalidad("Francia");
        author.setFechanacimiento("29 de Junio de 1900");

        System.out.println(author.getNombre());
        System.out.println(author.getApellido());
        System.out.println(author.getLocalidad());
        System.out.println(author.getFechanacimiento());

        Usuario user = new Usuario();
        user.setNombre("Daniel");
        user.setApellido("García Arruche");
        user.setDni("708325798N");
        user.setTelefono(654890537);
        user.setDireccion("Calle Juan Grande");

        System.out.println(user.getNombre());
        System.out.println(user.getApellido());
        System.out.println(user.getDni());
        System.out.println(user.getTelefono());
        System.out.println(user.getDireccion());


        Prestar loan = new Prestar();
        loan.setFechaprestar("3 de Noviembre de 2022");
        loan.setFechadevolver("10 de Noviembre de 2022");

        System.out.println(loan.getFechaprestar());
        System.out.println(loan.getFechadevolver());
    }
}