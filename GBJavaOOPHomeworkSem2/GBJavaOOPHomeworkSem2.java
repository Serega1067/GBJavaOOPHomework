package GBJavaOOPSeminars.GBJavaOOPHomeworkSem2;

/**
 * Урок 2. Принципы ООП Абстракция и интерфейсы. Пример 
 * проектирования.
 * Добавить поле статус.
 * Создать интерфейс с полями
 * 1. ударить
 * 2. получить повреждение
 * 3. вернуть статус
 * 4. переместиться
 * 5. вернуть состояние
 * Добавить обстрактный класс с конструктором.
 * Реализовать наследование.
 */

import java.util.List;
import java.util.ArrayList;

public class GBJavaOOPHomeworkSem2 {
    public static void main(String[] args) {
        List<Magician> allMagician = new ArrayList<>();
        while (allMagician.size() < 5) {
            allMagician.add(new Magician());
        }

        for (Magician magician : allMagician) {
            System.out.println(
            String.format("Маг: %s HP: %d Attack: %d", 
                          magician.getName(), magician.getHealth(), 
                          magician.getAttack()));
        }
        System.out.println();

        List<Sniper> allSniper = new ArrayList<>();
        while (allSniper.size() < 5) {
            allSniper.add(new Sniper());
        }

        for (Sniper sniper : allSniper) {
            System.out.println(
            String.format("Снайпер: %s HP: %d Attack: %d", 
                          sniper.getName(), sniper.getHealth(), 
                          sniper.getAttack()));
        }
        System.out.println();

        List<Peasant> allPeasants = new ArrayList<>();
        while (allPeasants.size() < 5) {
            allPeasants.add(new Peasant());
        }

        for (Peasant peasant : allPeasants) {
            System.out.println(
            String.format("Крестьянин: %s HP: %d Attack: %d", 
                          peasant.getName(), peasant.getHealth(), 
                          peasant.getAttack()));
        }
        System.out.println();

        List<Outlaw> allOutlaws = new ArrayList<>();
        while (allOutlaws.size() < 5) {
            allOutlaws.add(new Outlaw());
        }

        for (Outlaw outlaw : allOutlaws) {
            System.out.println(
            String.format("Разбойник: %s HP: %d Attack: %d", 
                          outlaw.getName(), outlaw.getHealth(), 
                          outlaw.getAttack()));
        }
        System.out.println();

        List<Spearman> allSpearmans = new ArrayList<>();
        while (allSpearmans.size() < 5) {
            allSpearmans.add(new Spearman());
        }

        for (Spearman spearman : allSpearmans) {
            System.out.println(
            String.format("Копейщик: %s HP: %d Attack: %d", 
                          spearman.getName(), spearman.getHealth(), 
                          spearman.getAttack()));
        }
        System.out.println();

        List<Crossbowman> allCrossbowmans = new ArrayList<>();
        while (allCrossbowmans.size() < 5) {
            allCrossbowmans.add(new Crossbowman());
        }

        for (Crossbowman crossbowman : allCrossbowmans) {
            System.out.println(
            String.format("Арбалетчик: %s HP: %d Attack: %d", 
                          crossbowman.getName(), crossbowman.getHealth(), 
                          crossbowman.getAttack()));
        }
        System.out.println();

        List<Monk> allMonks = new ArrayList<>();
        while (allMonks.size() < 5) {
            allMonks.add(new Monk());
        }

        for (Monk monk : allMonks) {
            System.out.println(
            String.format("Монах: %s HP: %d Attack: %d", 
                          monk.getName(), monk.getHealth(), 
                          monk.getAttack()));
        }
        System.out.println();
    }
}
