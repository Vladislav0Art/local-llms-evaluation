package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        AppVersion appVersion = AppVersion.parseName("appname-1.0.0-h123456.gitHash/JobName/234");

        assertNotNull(appVersion.hashCode());
    }

}