package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class Generated[estimate_DeltaT_Past1975Test]{

@Test
public void [estimate_DeltaT_Past1975Test](){
LocalDate forDate = LocalDate.of(1900, 1, 1);
double actual = DeltaT.estimate(forDate);

assertEquals(63.86+0.3345*(forDate.getYear() -2000)-0.060374*

pow((forDate.getYear() -2000),2)
        +0.0017275*

pow((forDate.getYear() -2000),3)+0.000651814*

pow((forDate.getYear() -2000),4)
        +0.00002373599*

pow((forDate.getYear() -2000),5),actual);
        }

        }