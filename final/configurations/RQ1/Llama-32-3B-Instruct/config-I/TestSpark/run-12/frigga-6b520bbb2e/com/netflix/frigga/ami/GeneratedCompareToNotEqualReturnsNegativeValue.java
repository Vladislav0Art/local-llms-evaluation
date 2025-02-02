package com.netflix.frigga.ami;

public class GeneratedCompareToNotEqualReturnsNegativeValue {

    @Test
    public void compareToNotEqualReturnsNegativeValue() {
        AppVersion a = new AppVersion();
        AppVersion b = new AppVersion("other");
        Assert.assertTrue(a.compareTo(b) < 0);
    }

}