package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCompareToWithSameObjectTest {

    @Test
    public void compareToWithSameObjectTest() {
        AppVersion instance = new AppVersion();
        assertTrue(instance.compareTo(instance) == 0);
    }

}