package ru.gb.homeworks.homework_01;

import java.util.HashMap;
import java.util.Map;

public class MontyHallSimulation {
    private int doorChangeWins = 0;
    private int withoutChangingWins = 0;
    private int totalGames;
    private Map<Integer, String> results = new HashMap<>();

    public MontyHallSimulation(int totalGames) {
        this.totalGames = totalGames;
    }

    public void runSimulation() {
        for (int i = 0; i < totalGames; i++) {
            Game game = new Game();

            if (game.playWithChange()) {
                doorChangeWins++;
                results.put(i, "Победа при смене двери");
            } else if (game.playWithoutChange()) {
                withoutChangingWins++;
                results.put(i, "Победа без смены двери");
            } else {
                results.put(i, "Поражение");
            }
        }
    }

    public void printResults() {
        for (Map.Entry<Integer, String> entry : results.entrySet()) {
            System.out.println("Попытка " + entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("Количество выигрышей при смене двери: " + doorChangeWins);
        System.out.println("Количество выигрышей без смены двери: " + withoutChangingWins);
    }
}
