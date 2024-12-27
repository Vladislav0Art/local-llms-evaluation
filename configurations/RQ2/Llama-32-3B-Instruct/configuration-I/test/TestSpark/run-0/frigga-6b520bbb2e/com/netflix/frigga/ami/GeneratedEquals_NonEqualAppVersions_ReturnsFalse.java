package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;
import java.util.Random;
import java.io.IOException;
import java.util.Collections;

public class GeneratedEquals_NonEqualAppVersions_ReturnsFalse {

    @Test
    public void equals_NonEqualAppVersions_ReturnsFalse() {
        AppVersion appVersion1 = new AppVersion("my-app-1.2.3");
        AppVersion appVersion2 = new AppVersion("other-app-1.2.3");
        assertFalse(appVersion1.equals(appVersion2));
    }

}