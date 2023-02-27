package com.bootcamp.domain;

import java.time.LocalDate;

public class Mentoring extends Content {
    private LocalDate date;


    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentoring{" +
                "name='" + getTitle()+ '\'' +
                ", description='" + getDescription() + '\'' +
                ", date=" + date +
                '}';
    }
}
