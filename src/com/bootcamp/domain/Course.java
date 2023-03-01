package com.bootcamp.domain;

public class Course extends Content {
    private int workLoad;

    @Override
    public double xpCalculate() {
        return XP_PADRAO + 40d;
    }

    public int getWorkLoad() {
        return workLoad;
    }

    public void setWorkLoad(int workLoad) {
        this.workLoad = workLoad;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", workLoad=" + workLoad +
                '}';
    }
}
