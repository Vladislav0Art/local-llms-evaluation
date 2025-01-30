package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCompareToDiffersOnPackageNameTest {

    @Test
    public void compareToDiffersOnPackageNameTest() {
        AppVersion app1 = AppVersion.parseName("myPackage1-1.2.3-586499.h150/WE-WAPP-myPackage/150");
        AppVersion app2 = AppVersion.parseName("myPackage2-1.2.3-586499.h150/WE-WAPP-myPackage/150");
        assertNotEquals(0, app1.compareTo(app2));
    }

}