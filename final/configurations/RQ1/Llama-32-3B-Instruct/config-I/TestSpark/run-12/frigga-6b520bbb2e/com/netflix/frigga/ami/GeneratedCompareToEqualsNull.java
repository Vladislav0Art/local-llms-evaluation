package com.netflix.frigga.ami;

public class GeneratedCompareToEqualsNull {

    @Test
    public void compareToEqualsNull() {
        AppVersion a = new AppVersion();
        AppVersion b = new AppVersion();
        Assert.assertTrue(a.compareTo(b) == 0);
    }

}