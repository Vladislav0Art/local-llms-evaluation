package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Generated[AppVersion][Scenario]

TestcompareTo {

    @Test
    public void [AppVersion][Scenario]TestcompareTo() {
        AppVersion appVersion1 = AppVersion.parseName("ami-name");
        AppVersion appVersion2 = AppVersion.parseName("another-ami-name");

        int result = appVersion.compareTo(appVersion2);
        assertEquals(-1, result); // should be less than
    }

}