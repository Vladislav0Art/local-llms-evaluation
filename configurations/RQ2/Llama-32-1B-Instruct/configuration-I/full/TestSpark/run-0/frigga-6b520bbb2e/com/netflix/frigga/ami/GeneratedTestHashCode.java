package com.netflix.frigga.ami;

import com.github.fricgaud.Ami;
import com.github.fricgaud.AmiVersion;
import org.junit.Before;
import org.junit.Test;

public class GeneratedTestHashCode {

    private Ami ami;

    @Before
    public void setUp() {
        String amiName = "ami-1234567890abcdef";
        ami = new Ami(amiName, "ubuntu", "20.04");
    }

    @Test
    public void testHashCode() {
        AmiVersion other = new Ami("ami-1234567890abcdef", "20.04");
        int hashCode1 = AppVersion.class.hashCode();
        int hashCode2 = AppVersion.class.hashCode();
        assertEquals(hashCode1, hashCode2);
        AppVersion appVersion1 = parseName("ami-567890123abc", "20.04");
        int hashCode3 = AppVersion.class.hashCode();
        assertEquals(hashCode3, hashCode1);
    }

}