package GBJavaOOPSeminars.GBJavaOOPHomeworkSem3;

/**
 * Урок 3. Некоторые стандартные интерфейсы Java и примеры их 
 * использования.
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GBJavaOOPHomeworkSem3 {
    public static void main(String[] args) {
        int step = 0;
        List<BaseHero> darkSide = new ArrayList<BaseHero>();
        List<BaseHero> whiteSide = new ArrayList<BaseHero>();

        darkSide.add(new Peasant(darkSide, 0,0));
        darkSide.add(new Outlaw(darkSide, 0,0));
        darkSide.add(new Sniper(darkSide, 0,0));
        darkSide.add(new Magician(darkSide, 0,0));
        Random rnd = new Random();
        for (int i = 0; i < 6; i++) {
            switch (rnd.nextInt(4)){
                case 0:
                    darkSide.add(new Peasant(darkSide, 0,0));
                    break;
                case 1:
                    darkSide.add(new Outlaw(darkSide, 0,0));
                    break;
                case 2:
                    darkSide.add(new Sniper(darkSide, 0,0));
                    break;
                default:
                    darkSide.add(new Crossbowman(darkSide, 0,0));
            }
        }

        whiteSide.add(new Peasant(whiteSide, 0,0));
        whiteSide.add(new Monk(whiteSide, 0,0));
        whiteSide.add(new Crossbowman(whiteSide, 0,0));
        whiteSide.add(new Spearman(whiteSide, 0,0));
        for (int i = 0; i < 6; i++) {
            switch (rnd.nextInt(4)){
                case 0:
                    whiteSide.add(new Peasant(whiteSide, 0,0));
                    break;
                case 1:
                    whiteSide.add(new Monk(whiteSide, 0,0));
                    break;
                case 2:
                    whiteSide.add(new Magician(whiteSide, 0,0));
                    break;
                default:
                    whiteSide.add(new Spearman(whiteSide, 0,0));
            }
        }

        if (step ==0 ){
            System.out.println("First step");
        } else {
            System.out.println("Step:" + Integer.toString(step));
        }
        System.out.println("--------------------------------------------");
        System.out.println("Dark side\t\t\t\t\t\t\tWhite side");
        for (int i = 0; i < darkSide.size(); i++) {
            if (darkSide.get(i).returnCondition().length() > 27) {
                System.out.println(darkSide.get(i).returnCondition() + "\t:\t" + whiteSide.get(i).returnCondition());
            } else {
                System.out.println(darkSide.get(i).returnCondition() + "\t\t:\t" + whiteSide.get(i).returnCondition());
            }
        }

        Scanner in = new Scanner(System.in);
        while (true) {
            String txt = in.nextLine();
            if (txt.equals("next")) {
                for (int i = 0; i < darkSide.size(); i++) {
                    darkSide.get(i).step();
                    whiteSide.get(i).step();
                    if (darkSide.get(i).returnCondition().length() > 27) {
                        System.out.println(darkSide.get(i).returnCondition() + "\t:\t" + whiteSide.get(i).returnCondition());
                    } else {
                        System.out.println(darkSide.get(i).returnCondition() + "\t\t:\t" + whiteSide.get(i).returnCondition());
                    }
                }
            }
            if (txt.equals("quit")) {
                break;
            }
        }
    }        
}
