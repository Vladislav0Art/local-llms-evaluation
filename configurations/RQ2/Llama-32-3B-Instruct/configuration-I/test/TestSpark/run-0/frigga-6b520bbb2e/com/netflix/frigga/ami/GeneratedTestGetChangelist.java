package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;
import java.util.Random;
import java.io.IOException;
import java.util.Collections;

public class GeneratedTestGetChangelist {

    private String appName;
    private int version;

    public AppVersion(String appName, int version) {
        this.appName = appName;
        this.version = version;
    }

    public static List<String> getChangelist() {
        return Arrays.asList("changelog1", "changelog2");
    }
}

public class TestAppVersion {

    @Test
    public void testGetChangelist() {
        List<String> changelist = AppVersion.getChangelist();
        assertEquals(Arrays.asList("changelog1", "changelog2"), changelist);
    }

}