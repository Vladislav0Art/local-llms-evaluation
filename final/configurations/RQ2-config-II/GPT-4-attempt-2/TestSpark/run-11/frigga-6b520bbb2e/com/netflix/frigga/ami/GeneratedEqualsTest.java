package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        AppVersion app1 = new AppVersion("ami");
        AppVersion app2 = new AppVersion("ami");

        assertTrue(app1.equals(app2));
    }

}