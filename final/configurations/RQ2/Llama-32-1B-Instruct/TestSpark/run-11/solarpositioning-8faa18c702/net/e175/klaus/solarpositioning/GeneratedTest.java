package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Random;

public class GeneratedTest {

    public double estimateForValidDate(LocalDate forDate) {
        return pow(0.00001, forDate.getDayOfMonth());
    }

}