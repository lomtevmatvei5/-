package ru.ac.uniyar.mf.lomtev;
import java.util.Scanner;

class Fs {
    int fz, fm;

    public Fs(int x, int y) {
        fz = x;
        fm = y;
    }

    public Fs sum(Fs fs) {
        int Fz = fz * fs.fm + fm * fs.fz;
        int Fm = fm * fs.fm;
        return new Fs(Fz, Fm);
    }

    public Fs minus(Fs fs) {
        int Fz = fz * fs.fm - fm * fs.fz;
        int Fm = fm * fs.fm;
        return new Fs(Fz, Fm);
    }

    public Fs multiply(Fs fs) {
        int Fz = fz * fs.fz;
        int Fm = fm * fs.fm;
        return new Fs(Fz, Fm);
    }

    public Fs div(Fs fs) {
        int Fz = fz * fs.fm;
        int Fm = fm * fs.fz;
        return new Fs(Fz, Fm);
    }

    public int gcd (int n, int m) {// Найти наименьшее общее кратное
        int r = n % m;
        while (r != 0) {
            n = m;
            m = r;
            r = n % m;
        }
        return m;
    }

    public void showfrac() {
       if (fz % fm == 0)
           System.out.println(this.fz / this.fm);
       else
           System.out.println(this.fz + "/" + this.fm);
   }

    public String frac2str(){
        return String.valueOf(fz + "/" + fm);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Выберите калькулятор:");
        Scanner in = new Scanner(System.in);
        int _case = in.nextInt();
        switch(_case) {
            case 1:
                int num_1 = in.nextInt();
                String symb = in.next();
                int num_2 = in.nextInt();
                switch (symb) {
                    case "+":
                        System.out.println(num_1 + num_2);
                        break;
                    case "-":
                        System.out.println(num_1 - num_2);
                        break;
                    case "*":
                        System.out.println(num_1 * num_2);
                        break;
                    case "/":
                        if (num_2 == 0) {
                            System.out.println("Нет решений");
                            break;
                        } else
                            System.out.println(num_1 / num_2);
                        break;
                }
            case 2:
                int num1 = in.nextInt();
                String symb1 = in.next();
                int num2 = in.nextInt();
                Fs frac_1 = new Fs(num1, num2);
                String symb3 = in.next();
                int num_3 = in.nextInt();
                String symb2 = in.next();
                int num_4 = in.nextInt();
                Fs frac_2 = new Fs(num_3, num_4);
                switch (symb3) {
                    case "+":
                        Fs new_frac = frac_1.sum(frac_2);
                        new_frac.showfrac();
                        break;
                    case "-":
                        Fs new_frac_2 = frac_1.minus(frac_2);
                        new_frac_2.showfrac();
                        break;
                    case "*":
                        Fs new_frac_3 = frac_1.multiply(frac_2);
                        new_frac_3.showfrac();
                        break;
                    case "/":
                        Fs new_frac_4 = frac_1.div(frac_2);
                        new_frac_4.showfrac();
                        break;
                }
        }
    }

    public static String calculate(int num, String s, String s1, String s2) {
        int _case = num;
        switch (_case) {
            case 1:
                int num_1 = Integer.parseInt(s);
                String symb = s1;
                int num_2 = Integer.parseInt(s2);
                switch (symb) {
                    case "+":
                        return String.valueOf(num_1 + num_2);
                    case "-":
                        return String.valueOf(num_1 - num_2);
                    case "*":
                        return String.valueOf(num_1 * num_2);
                    case "/":
                        if (num_2 == 0) {
                            return "0";
                        } else
                            return String.valueOf(num_1 / num_2);
                }
            case 2:
                String[] parts = s.split("/");
                int num1 = Integer.parseInt(parts[0]);
                int num2 = Integer.parseInt(parts[1]);
                Fs frac_1 = new Fs(num1, num2);
                String symb3 = s1;
                String[] parts2 = s2.split("/");
                int num_3 = Integer.parseInt(parts2[0]);
                int num_4 = Integer.parseInt(parts2[1]);
                Fs frac_2 = new Fs(num_3, num_4);
                switch (symb3) {
                    case "+":
                        Fs new_frac = frac_1.sum(frac_2);
                        return new_frac.frac2str();
                    case "-":
                        Fs new_frac_2 = frac_1.minus(frac_2);
                        return new_frac_2.frac2str();
                    case "*":
                        Fs new_frac_3 = frac_1.multiply(frac_2);
                        return new_frac_3.frac2str();
                    case "/":
                        Fs new_frac_4 = frac_1.div(frac_2);
                        return new_frac_4.frac2str();
                }
        }
        return "0";
    }
}