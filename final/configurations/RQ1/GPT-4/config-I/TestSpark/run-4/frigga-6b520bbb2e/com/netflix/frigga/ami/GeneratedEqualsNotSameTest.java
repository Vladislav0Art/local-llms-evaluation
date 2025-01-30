package com.netflix.frigga.ami;

import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class GeneratedEqualsNotSameTest {

    @Test
    public void equalsNotSameTest() {
        AppVersion appVersion1 = AppVersion.parseName("app-1.1.1-build2/WE-APP-app/2");
        AppVersion appVersion2 = AppVersion.parseName("app-1.1.1-build2/WE-APP-app/3");

        assertFalse(appVersion1.equals(appVersion2));
    }

}