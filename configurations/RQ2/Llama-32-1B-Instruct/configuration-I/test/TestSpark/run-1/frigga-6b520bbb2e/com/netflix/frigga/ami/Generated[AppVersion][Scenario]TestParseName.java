package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Generated[AppVersion][Scenario]

TestParseName {

    @Test
    public void [AppVersion][Scenario]TestParseName() {
        AppVersion appVersion = AppVersion.parseName("ami-name");
        assertEquals("ami-name", appVersion.getPackageName());
    }

}