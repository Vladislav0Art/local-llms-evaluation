package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Generated[AppVersion][Scenario]

TestToString {

    @Test
    public void [AppVersion][Scenario]TestToString() {
        AppVersion appVersion = AppVersion.parseName("ami-name");
        String toString = appVersion.toString();
        assertEquals("ami-name", toString);
    }

}