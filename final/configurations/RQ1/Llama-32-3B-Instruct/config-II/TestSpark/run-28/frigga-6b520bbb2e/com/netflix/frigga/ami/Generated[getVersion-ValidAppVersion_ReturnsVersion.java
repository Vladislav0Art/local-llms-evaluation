package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Generated[getVersion-

ValidAppVersion_ReturnsVersion {

    @Test
    public void [getVersion - ValidAppVersion_ReturnsVersion() {
        AppVersion appVersion = new AppVersion();
        appVersion.setVersion("1.0.0");
        assertEquals("1.0.0", AppVersion.getVersion(appVersion));
    }

}