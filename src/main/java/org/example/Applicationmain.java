package org.example;

import java.time.LocalDateTime;

public enum Applicationmain {
    APPLICATION;

    /**
     *
     * @param args
     */
    public void run(String [] args) {
        Personnel p1 = new Personnel
                .Builder("P1", "P1")
                .telephone("+23333333").naissance(LocalDateTime.of(1912,12,12,12,12)).fonction("salariéYYY")
                .build();
    }
    /**
     *
     */
    public static void main(String [] args) {
        APPLICATION.run(args);
    }
}
