package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestParseName {

    @Test
    public void testParseName() {
        AppVersion appVersion = AppVersion.parseName("ami123");
        assertEquals(NameConstants.AMI_VERSION_PREFIX + "123", appVersion.getPackageName());
        assertEquals(NameConstants.AMI_VERSION_PREFIX + "123", appVersion.getVersion());
    }

}