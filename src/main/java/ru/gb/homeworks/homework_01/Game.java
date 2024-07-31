package ru.gb.homeworks.homework_01;

import java.util.List;
import java.util.Random;

public class Game {
    private List<Door> doors;
    private int playerChoice;
    private int hostChoice;
    private int remainingDoor;

    public Game() {
        Random random = new Random();

        // Инициализация дверей
        doors = List.of(new Door(false), new Door(false), new Door(false));
        doors.get(random.nextInt(3)).hasCar = true; // Размещение машины за случайной дверью

        // Игрок делает выбор
        playerChoice = random.nextInt(3);

        // Ведущий выбирает дверь без машины
        for (int i = 0; i < doors.size(); i++) {
            if (i != playerChoice && !doors.get(i).hasCar()) {
                hostChoice = i;
                break;
            }
        }

        // Определение оставшейся двери
        for (int i = 0; i < doors.size(); i++) {
            if (i != playerChoice && i != hostChoice) {
                remainingDoor = i;
                break;
            }
        }
    }

    public boolean playWithChange() {
        return doors.get(remainingDoor).hasCar();
    }

    public boolean playWithoutChange() {
        return doors.get(playerChoice).hasCar();
    }
}
