package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Generated[AppVersion][Scenario]

TestGetVersion {

    @Test
    public void [AppVersion][Scenario]TestGetVersion() {
        AppVersion appVersion = AppVersion.parseName("ami-name");
        String version = appVersion.getVersion();
        assertEquals("1.0.0", version); // should be "1.0.0"
    }

}