package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedGetVersion_ReturnsVersionNumber {

    @Test
    public void getVersion_ReturnsVersionNumber() {
        AppVersion appVersion = new AppVersion("1.2.3");
        assertEquals(123, Integer.parseInt(appVersion.getVersion()));
    }

}