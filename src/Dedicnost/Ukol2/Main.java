package Dedicnost.Ukol2;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Person nikdo = new Person();
        nikdo.name = "Človíček";
        nikdo.age = 50;
        nikdo.introduce();

        System.out.println();
        System.out.println();

        Student pepa = new Student();
        pepa.name = "Pepa";
        pepa.age = 50;
        pepa.school = "INFIS";
        pepa.chodiDoSkoly();
        pepa.introduce();

        System.out.println();
        System.out.println();

        Teacher atmnk = new Teacher();
        atmnk.name = "Vitaliy Atamanjuk";
        atmnk.age = 21;
        atmnk.predmet = "Programování";
        atmnk.ucit();
        atmnk.introduce();

    }

}
