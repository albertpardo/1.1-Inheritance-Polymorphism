package level3ex1;

public class Writer {
    String name;
    String dni;
    static double salary;

    public Writer(String name, String dni){
        this.name = name;
        this.dni = dni;
        salary = 1500;
        // TODO definir lista de objetos news. Mirar Collections, List, Set
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return ("Name : " + name + ", DNI : " + dni + ", Salary: " + salary) ;
    }
}
