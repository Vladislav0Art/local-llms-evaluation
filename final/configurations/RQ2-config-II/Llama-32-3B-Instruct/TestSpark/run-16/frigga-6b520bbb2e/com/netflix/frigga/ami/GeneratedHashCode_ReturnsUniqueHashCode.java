package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedHashCode_ReturnsUniqueHashCode {

    @Test
    public void hashCode_ReturnsUniqueHashCode() {
        AppVersion first = new AppVersion("1.0");
        AppVersion second = new AppVersion("2.0");
        assertNotEquals(first.hashCode(), second.hashCode());
    }

}