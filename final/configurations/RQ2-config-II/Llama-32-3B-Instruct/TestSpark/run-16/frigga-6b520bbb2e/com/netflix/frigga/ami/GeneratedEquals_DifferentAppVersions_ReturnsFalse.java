package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedEquals_DifferentAppVersions_ReturnsFalse {

    @Test
    public void equals_DifferentAppVersions_ReturnsFalse() {
        AppVersion first = new AppVersion("1.0");
        AppVersion second = new AppVersion("2.0");
        assertFalse(first.equals(second));
    }

}