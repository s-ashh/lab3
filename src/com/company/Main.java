package com.company;

public class Main {
    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
        task4();
    }

    /**
     * Дана непустая строка S. Вывести строку, содержащую символы строки S, между которыми вставлено по одному пробелу.
     */
    public static void task1() {
        String str = "СлаваУкраїні!";
        str = str.replaceAll("(.{1})", "$1 ");
        System.out.println(str);
    }

    /**
     * Даны строки S и S0. Удалить из строки S последнюю подстроку, совпадающую с S0. Если совпадающих подстрок нет, то вывести строку S без изменений.
     */
    public static void task2() {
        String S = "Слава Україні Слава Україні", S0 = "Україні";
        String[] words = S.split(" ");
        for (int i = words.length - 1; i > -1; i--)
            if (words[i].equals(S0)) {
                words[i] = "";
                break;
            }
        S = String.join(" ", words);
        System.out.println(S);
    }

    /**
     *  Дана строка-предложение с избыточными пробелами между словами. Преобразовать ее так, чтобы между словами был ровно один пробел.
     */
    public static void task3() {
        String str = "Слава      Україні!";
        do
            str = str.replace("  ", " ");
        while (str.contains("  "));
        System.out.println(str);
    }

    /**
     * Дана строка, содержащая цифры и строчные латинские буквы. Если буквы в строке упорядочены по алфавиту, то вывести 0; в противном случае вывести номер первого символа строки, нарушающего алфавитный порядок.
     */
    public static void task4() {
    String S = "1234абвгдея";
    boolean complete = true;
    char[] S1 = S.toCharArray();
        for(int i=0;i<S1.length -1;i++) {
        do{
            if (S1[i] == S1[i + 1] - 1)
                i++;
            else {
                System.out.println(S1[i + 1]);
                complete = false;
                break;
            }
        }while (S1[i] > 1071 && S1[i] < 1104 && i < S1.length - 1);

    }
        if(complete)
            System.out.println(0);
    }
}