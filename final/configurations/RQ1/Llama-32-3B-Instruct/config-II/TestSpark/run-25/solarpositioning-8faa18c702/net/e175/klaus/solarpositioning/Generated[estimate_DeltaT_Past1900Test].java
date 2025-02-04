package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class Generated[estimate_DeltaT_Past1900Test]{

@Test
public void [estimate_DeltaT_Past1900Test](){
LocalDate forDate = LocalDate.of(1800, 12, 31);
double actual = DeltaT.estimate(forDate);

assertEquals(-20+32*pow(((forDate.getYear() -1820)/100),2),actual);
        }

        }