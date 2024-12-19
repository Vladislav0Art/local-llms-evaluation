package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

public class GeneratedEquals_DifferentAppVersions_ReturnsFalse {

    @Test
    public void equals_DifferentAppVersions_ReturnsFalse() {
        AppVersion appVersion1 = new AppVersion(1, 2, 3);
        AppVersion appVersion2 = new AppVersion(1, 4, 6);
        assertFalse(appVersion1.equals(appVersion2));
    }

}