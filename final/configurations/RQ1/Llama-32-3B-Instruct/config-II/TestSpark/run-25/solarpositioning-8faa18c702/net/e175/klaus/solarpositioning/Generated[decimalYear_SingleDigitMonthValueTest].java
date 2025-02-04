package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class Generated[decimalYear_SingleDigitMonthValueTest]{

@Test
public void [decimalYear_SingleDigitMonthValueTest](){
LocalDate forDate = LocalDate.of(2000, 6, 1);
double actual = DeltaT.decimalYear(forDate);

assertEquals(2001.5,actual);
	}

            }