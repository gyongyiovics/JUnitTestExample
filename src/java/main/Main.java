package main;

public class Main {

    public static void main(String[] args) {

        String[] students = {"Kata", "Judit", "Soma", "Krisztina", "Anita", "Rob", "Alexandra", "Mizsó", "Bea", "Flóra", "Gergő",
            "Gyöngyi", "Imre", "Dávid", "Zoltán", "Szabina", "Lóri", "Misi", "Csaba", "Máté", "Gyuri", "Beni"};

        int index = (int)(Math.random() * students.length);

        System.out.println(students[index]);

    }
}
