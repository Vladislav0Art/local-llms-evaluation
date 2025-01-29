package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestEquals {

    @Test
    public void testEquals() {
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = new AppVersion();
        appVersion1.setVersion("123");
        Mockito.when(AppVersion.compareTo(in sameObject As AppVersion)).thenReturn(true);
        assertTrue(appVersion1.equals(appVersion2));
        Mockito.when(AppVersion.compareTo(in null As AppVersion)).thenReturn(false);
    }

}