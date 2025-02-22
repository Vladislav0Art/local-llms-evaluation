package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestGetBuildJobName {

    @Test
    public void testGetBuildJobName() {
        AppVersion appVersion = new AppVersion();
        assertNull(appVersion.getBuildJobName());
    }

}