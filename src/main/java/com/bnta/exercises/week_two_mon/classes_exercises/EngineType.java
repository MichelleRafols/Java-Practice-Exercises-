package com.bnta.exercises.week_two_mon.classes_exercises;

public enum EngineType {
    PETROL ("Petrol"),
    ELECTRIC ("Electric");

    private String engine;

    EngineType(String engine) {
        this.engine = engine;
    }

    public String getEngine() {
        return engine;
    }
}
