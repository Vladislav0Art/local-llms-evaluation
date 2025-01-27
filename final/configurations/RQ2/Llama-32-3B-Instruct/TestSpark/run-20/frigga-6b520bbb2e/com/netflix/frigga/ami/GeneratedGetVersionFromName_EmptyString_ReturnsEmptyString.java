package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedGetVersionFromName_EmptyString_ReturnsEmptyString {

    @Test
    public void getVersionFromName_EmptyString_ReturnsEmptyString() {
        String amiName = "";
        assertEquals("", AppVersionUtils.getVersionFromName(amiName));
    }
}

}