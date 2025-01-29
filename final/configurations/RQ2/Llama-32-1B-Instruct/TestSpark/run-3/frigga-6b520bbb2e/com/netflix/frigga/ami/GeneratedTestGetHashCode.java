package com.netflix.frigga.ami;

public class GeneratedTestGetHashCode {

    private AppVersion appVersion;

    @Test
    public void testGetHashCode() {
        appVersion = AppVersion.create("my-app-name");
        int hashCode = appVersion.hashCode();
        assertNotNull(hashCode);
        assertEquals(123, hashCode);
    }

}