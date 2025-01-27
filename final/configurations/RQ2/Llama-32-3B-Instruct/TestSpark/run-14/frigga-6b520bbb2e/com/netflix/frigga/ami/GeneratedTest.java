package com.netflix.frigga.ami;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest {

    private String version;
    private String application;

    public AppVersion(String version, String application) {
        this.version = version;
        this.application = application;
    }

    public boolean isCompatible() {
        // implementation
        return true;
    }
}

package com.netflix.frigga.ami;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions .*;

public class AppVersionTest {

    @Test
    public void testIsCompatible() {
        String version1 = "1.2.3-4";
        String app = "com.example.app";

        AppVersion av1 = new AppVersion(version1, app);
        assertTrue(av1.isCompatible());

        String version2 = "5.6.7-8";
        AppVersion av2 = new AppVersion(version2, app);
        assertFalse(av2.isCompatible());
    }

}