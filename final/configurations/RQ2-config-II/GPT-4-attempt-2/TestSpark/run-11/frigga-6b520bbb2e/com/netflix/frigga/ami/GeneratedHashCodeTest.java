package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        AppVersion test = new AppVersion("hashCode");
        assertEquals(test.hashCode(), new AppVersion("hashCode").hashCode());
    }

}