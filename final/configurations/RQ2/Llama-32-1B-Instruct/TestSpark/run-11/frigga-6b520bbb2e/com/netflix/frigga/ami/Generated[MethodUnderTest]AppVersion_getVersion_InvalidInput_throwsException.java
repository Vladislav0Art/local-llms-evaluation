package com.netflix.frigga.ami;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Generated[MethodUnderTest]

AppVersion_getVersion_InvalidInput_throwsException {

    public AppVersion parseName (String amiName){
        return new AppVersion();
    }

    @Test
    public void [MethodUnderTest]AppVersion_getVersion_InvalidInput_throwsException() {
        String amiName = "invalid-ami-name";
        when(AppVersion.parseName(amiName)).thenReturn(new AppVersion("valid"));
        assertThrows(IllegalArgumentException.class, () -> parseName(amiName));
    }

}