package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Generated[AppVersion][Scenario]

TestHashCode {

    @Test
    public void [AppVersion][Scenario]TestHashCode() {
        AppVersion appVersion = AppVersion.parseName("ami-name");

        int result = appVersion.hashCode();
        assertEquals(12345, result); // should be 12345
    }

}