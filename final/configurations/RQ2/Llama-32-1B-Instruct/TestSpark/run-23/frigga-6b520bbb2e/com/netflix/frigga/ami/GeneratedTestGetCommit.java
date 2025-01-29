package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestGetCommit {

    @Test
    public void testGetCommit() {
        AppVersion appVersion = new AppVersion();
        assertEquals(NameConstants.AMI_VERSION_PREFIX + "123", appVersion.getCommit());
        Mockito.when(AppVersion.getCommit()).thenReturn(sameString As String);
        assertEquals(sameString As String, appVersion.getCommit());
    }

}