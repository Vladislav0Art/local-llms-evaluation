package com.netflix.frigga.ami;

import com.github.fricgaud.Ami;
import com.github.fricgaud.AmiVersion;
import org.junit.Before;
import org.junit.Test;

public class GeneratedTestEquals {

    private Ami ami;

    @Before
    public void setUp() {
        String amiName = "ami-1234567890abcdef";
        ami = new Ami(amiName, "ubuntu", "20.04");
    }

    @Test
    public void testEquals() {
        AmiVersion other = new AmiVersion(ami.getRpmPackage(), "20.04");
        assertTrue(AppVersion.class.isAssignableFrom(other.getClass()));
        AppVersion appVersion1 = parseName("ami-1234567890abcdef");
        AppVersion appVersion2 = new Ami("ami-567890123abc", "20.04");
        assertEquals(appVersion1, appVersion2);
    }

}