package Homework1;

public class Main {
    public static void main(String[] args){
        Basket b1 = new Basket();
        b1.add("banane");
        b1.add("mere");
        b1.add("capsuni");
        b1.add("portocale");
        System.out.println("Banana a fost gasita in cos true/false: " + b1.find("banane"));
        System.out.println("Am reusit cu succes sa scoatem merele true/false :" +b1.remove("mere"));
        System.out.println("Pozitia pe care se afla portocalele este: " + b1.position("portocale"));
        System.out.println("Numarul de fructe este (folosind count() ) : " + b1.count());
        System.out.println("Numarul de fructe este (folosind customCount() ) : " + b1.customCount());
    }
}
