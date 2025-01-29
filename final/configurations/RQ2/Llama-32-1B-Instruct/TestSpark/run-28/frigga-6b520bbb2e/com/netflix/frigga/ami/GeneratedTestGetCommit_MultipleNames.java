package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.jupiter.api.Test;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class GeneratedTestGetCommit_MultipleNames {

    @Test
    public void testGetCommit_MultipleNames() {
        String[] expected = {"latest", NameConstants.AMI_VERSION};
        when(getCommit()).thenReturn(expected);
        AppVersion appVersion = new AppVersion();
        assertEquals(appVersion, AppVersion.getCommit());
    }

}