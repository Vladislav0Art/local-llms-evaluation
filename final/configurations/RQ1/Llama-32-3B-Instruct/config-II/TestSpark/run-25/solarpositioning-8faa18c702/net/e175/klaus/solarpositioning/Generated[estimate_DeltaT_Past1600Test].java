package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class Generated[estimate_DeltaT_Past1600Test]{

@Test
public void [estimate_DeltaT_Past1600Test](){
LocalDate forDate = LocalDate.of(1500, 12, 31);
double actual = DeltaT.estimate(forDate);

assertEquals(1564.2-556.01*(forDate.getYear() -1000)/100
        +71.23472*

pow((forDate.getYear() -1000)/100,2)
        ,actual);
        }

        }