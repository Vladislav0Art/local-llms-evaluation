package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Generated[AppVersion][Scenario]

TestGetPackageName {

    @Test
    public void [AppVersion][Scenario]TestGetPackageName() {
        AppVersion appVersion = AppVersion.parseName("ami-name");
        String packageName = appVersion.getPackageName();
        assertEquals("ami-name", packageName);
    }

}