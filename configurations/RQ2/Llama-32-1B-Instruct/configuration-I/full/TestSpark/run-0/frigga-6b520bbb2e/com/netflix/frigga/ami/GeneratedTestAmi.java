package com.netflix.frigga.ami;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestAmi {

    @Test
    public void testAmi() {
        Ami ami = new Ami("1", "20.04");
        assertEquals(ami.getRpmPackage(), ami.getRpmPackage());
        assertEquals(ami.getName(), ami.getName());

        AmiVersion other = new AmiVersion(ami.getRpmPackage(), "20.04");
        assertEquals(other.hashCode(), ami.hashCode());
    }

}