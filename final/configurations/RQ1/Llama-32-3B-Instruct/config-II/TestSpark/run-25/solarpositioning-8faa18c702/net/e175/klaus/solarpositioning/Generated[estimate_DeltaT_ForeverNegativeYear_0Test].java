package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class Generated[estimate_DeltaT_ForeverNegativeYear_0Test]{

@Test
public void [estimate_DeltaT_ForeverNegativeYear_0Test](){
LocalDate forDate = LocalDate.of(-1900, 12, 31);
double actual = DeltaT.estimate(forDate);

assertEquals(0,actual);
		}
                }

                }