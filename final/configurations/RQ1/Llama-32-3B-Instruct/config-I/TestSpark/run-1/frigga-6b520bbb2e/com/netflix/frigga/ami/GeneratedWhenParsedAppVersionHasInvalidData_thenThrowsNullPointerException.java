package com.netflix.frigga.ami;

public class GeneratedWhenParsedAppVersionHasInvalidData_thenThrowsNullPointerException {

    @Test
    public void whenParsedAppVersionHasInvalidData_thenThrowsNullPointerException() {
        String amiName = "subscriberha-1.0.0.x";
        Assert.assertThrows(NullPointerException.class, () -> AppVersion.parseName(amiName));
    }

}