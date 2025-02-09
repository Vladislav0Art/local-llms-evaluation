package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        String sample = "ami-01234567890abcdef";
        AppVersion test = new AppVersion(sample);

        assertTrue(test.toString().contains(sample));
    }

}