package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestGetChangelist {

    @Test
    public void testGetChangelist() {
        AppVersion appVersion = new AppVersion();
        assertEquals(null, appVersion.getChangelist()); // DEPRECATED
        Mockito.when(AppVersion.getChangelist()).thenReturn(sameString As String);
        assertEquals(sameString As String, appVersion.getChangelist());
    }

}