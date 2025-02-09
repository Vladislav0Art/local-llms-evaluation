package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.regex.Pattern;

public class GeneratedToString_AmiStringRepresentationTest {

    @Test
    public void toString_AmiStringRepresentationTest() {
        AppVersion appVersion = new AppVersion("1.0.2-20180808T1439Z");
        assertNotNull(appVersion.toString());
    }

}