package Dedicnost.Ukol2;

public class Teacher extends Person{
    String predmet;

    public void ucit(){
        System.out.println("Učí");
    }

    @Override
    public void introduce(){
        super.introduce();
        System.out.println("Jméno: " + name + ", věk: " + age + ", předmět: " + predmet);
    }
}
