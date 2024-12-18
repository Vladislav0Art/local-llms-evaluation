package com.netflix.frigga.ami;

import com.github.fricgaud.Ami;
import com.github.fricgaud.AmiVersion;
import org.junit.Before;
import org.junit.Test;

public class GeneratedTestGetPackageName {

    private Ami ami;

    @Before
    public void setUp() {
        String amiName = "ami-1234567890abcdef";
        ami = new Ami(amiName, "ubuntu", "20.04");
    }

    @Test
    public void testGetPackageName() {
        assertEquals("ubuntu", ami.getVersion().getRpmPackage());
    }

}