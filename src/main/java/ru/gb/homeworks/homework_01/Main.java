package ru.gb.homeworks.homework_01;

public class Main {

    public static void main(String[] args) {
        int quantity = 1000; // количество игр

        MontyHallSimulation simulation = new MontyHallSimulation(quantity);
        simulation.runSimulation();
        simulation.printResults();
    }
}
