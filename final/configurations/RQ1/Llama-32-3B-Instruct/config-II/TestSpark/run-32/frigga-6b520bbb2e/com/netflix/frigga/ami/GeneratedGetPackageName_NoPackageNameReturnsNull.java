package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.*;

public class GeneratedGetPackageName_NoPackageNameReturnsNull {

    @Test
    public void getPackageName_NoPackageNameReturnsNull() {
        AppVersion appVersion = new AppVersion();
        assertNull(appVersion.getPackageName());
    }
}

public class AppVersion {
    // getters and setters for fields

    private String packageName;

    public String getPackageName() {
        return packageName;
    }

    public static AppVersion parseName(String amiName) {
        // implementation
    }

    @Override
    public int compareTo(AppVersion other) {
        // implementation
    }

}