package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedEquals_SameAppVersions_ReturnsTrue {

    @Test
    public void equals_SameAppVersions_ReturnsTrue() {
        AppVersion first = new AppVersion("1.0");
        AppVersion second = new AppVersion("1.0");
        assertTrue(first.equals(second));
    }

}