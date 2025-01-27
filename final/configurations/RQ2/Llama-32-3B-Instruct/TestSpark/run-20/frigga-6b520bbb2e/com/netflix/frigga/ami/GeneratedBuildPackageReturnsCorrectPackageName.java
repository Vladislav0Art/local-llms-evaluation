package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedBuildPackageReturnsCorrectPackageName {

    @Test
    public void buildPackageReturnsCorrectPackageName() {
        assertEquals("com.netflix.frigga", new AppVersionBuilder().buildPackage()).getPackageName();
    }

}