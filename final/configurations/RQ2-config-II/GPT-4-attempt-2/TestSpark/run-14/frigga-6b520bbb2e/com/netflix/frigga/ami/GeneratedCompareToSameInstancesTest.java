package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCompareToSameInstancesTest {

    @Test
    public void compareToSameInstancesTest() {
        AppVersion version = AppVersion.parseName("my-package-0.0.1-h1.b1-abcdef");
        assertEquals(0, version.compareTo(version));
    }

}