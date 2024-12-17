package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

public class GeneratedEquals_SameAppVersion_ReturnsTrue {

    @Test
    public void equals_SameAppVersion_ReturnsTrue() {
        AppVersion appVersion1 = new AppVersion(1, 2, 3);
        AppVersion appVersion2 = new AppVersion(1, 2, 3);
        assertTrue(appVersion1.equals(appVersion2));
    }

}