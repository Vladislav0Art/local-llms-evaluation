package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestHashCode {

    @Test
    public void testHashCode() {
        AppVersion appVersion = new AppVersion();
        int actualHashCode = appVersion.hashCode();
        Mockito.when(AppVersion.hashCode()).thenReturn(actualHashCode);
        assertEquals(actualHashCode, appVersion.hashCode());
    }

}