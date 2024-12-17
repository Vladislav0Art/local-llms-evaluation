package com.netflix.frigga.ami;

public class GeneratedTestNotEquals {

    private static AppVersion appVersion1 = new AppVersion();
    private static AppVersion appVersion2 = new AppVersion();

    @Test
    public void testNotEquals() throws Exception {
        assertTrue(!appVersion1.equals(appVersion2));
    }
}

public class TestPublicClass {

    public static AppVersion getAppVersion() {
        return new AppVersion();
    }

}