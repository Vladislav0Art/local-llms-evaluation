package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.Test;

public class GeneratedTestGetPackageName {

    @Test
    public void testGetPackageName() {
        // Create an instance of AppVersion directly without calling the constructor
        String packageName = "package-name";
        AppVersion appVersion = new AppVersion();
        assertEquals(packageName, appVersion.getPackageName());
    }

}