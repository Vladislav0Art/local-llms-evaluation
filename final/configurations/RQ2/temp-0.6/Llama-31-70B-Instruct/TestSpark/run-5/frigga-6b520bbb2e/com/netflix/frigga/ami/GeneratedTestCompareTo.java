package com.netflix.frigga.ami;

public class GeneratedTestCompareTo {

    @Test
    public void testCompareTo() {
        AppVersion one = new AppVersion();
        one.packageName = "packageOne";
        AppVersion two = new AppVersion();
        two.packageName = "packageTwo";
        assertTrue(one.compareTo(two) < 0);
    }

}