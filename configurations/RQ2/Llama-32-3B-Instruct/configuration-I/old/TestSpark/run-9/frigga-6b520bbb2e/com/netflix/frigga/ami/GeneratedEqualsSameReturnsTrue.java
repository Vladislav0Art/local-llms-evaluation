package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEqualsSameReturnsTrue {

    @Test
    public void equalsSameReturnsTrue() {
        AppVersion appVersion1 = new AppVersion("1.0-2.0");
        AppVersion appVersion2 = new AppVersion("1.0-2.0");
        boolean result = appVersion1.equals(appVersion2);
        // Test implementation
    }

}