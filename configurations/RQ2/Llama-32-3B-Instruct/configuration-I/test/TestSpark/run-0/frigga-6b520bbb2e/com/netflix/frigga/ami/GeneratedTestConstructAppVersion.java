package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;
import java.util.Random;
import java.io.IOException;
import java.util.Collections;

public class GeneratedTestConstructAppVersion {

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
    public void testConstructAppVersion() {
        String appName = "my-app-1.2.3";
        int version = 12345;
        AppVersion appVersion = new AppVersion(appName, version);
        assertNotNull(appVersion);
    }
}

public class TestAppVersionMethodOverride extends AppVersion {

    public TestAppVersionMethodOverride(String appName) {
        super(appName, 1);
    }

    @Override
    public List<String> getChangelist() {
        return Arrays.asList("changelog1", "changelog2");
    }
}

public class TestTestAppVersionMethodOverride extends AppVersion {

    public TestTestAppVersionMethodOverride(String appName) {
        super(appName, 123);
    }

    @Override
    public List<String> getChangelist() {
        return Arrays.asList("changelog1", "changelog2");
    }
}

public class TestAppVersionNoArgs extends AppVersion {

    public TestAppVersionNoArgs(String appName) {
        super(appName, 0);
    }
}

public class TestTestAppVersionNoArgs extends AppVersion {

    public TestTestAppVersionNoArgs(String appName) {
        super(appName, 0);
    }

}