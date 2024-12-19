package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEqualsDifferentReturnsFalse {

    @Test
    public void equalsDifferentReturnsFalse() {
        AppVersion appVersion1 = new AppVersion("1.0-2.0");
        AppVersion appVersion2 = new AppVersion("3.0-4.0");
        boolean result = appVersion1.equals(appVersion2);
        // Test implementation
    }

}