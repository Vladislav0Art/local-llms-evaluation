package com.netflix.frigga.ami;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Generated[MethodUnderTest]

AppVersion_getPackageName_NoInput_returnsEmptyString {

    public AppVersion parseName (String amiName){
        return new AppVersion();
    }

    @Test
    public void [MethodUnderTest]AppVersion_getPackageName_NoInput_returnsEmptyString() {
        String amiName = "";
        AppVersion appVersion = parseName(amiName);
        assertEquals("", appVersion.getPackageName());
    }

}