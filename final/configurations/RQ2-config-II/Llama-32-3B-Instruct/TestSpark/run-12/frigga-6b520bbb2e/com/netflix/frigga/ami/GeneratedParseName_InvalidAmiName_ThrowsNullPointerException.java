package com.netflix.frigga.ami;

public class GeneratedParseName_InvalidAmiName_ThrowsNullPointerException {

    @Test
    public void parseName_InvalidAmiName_ThrowsNullPointerException() {
        String invalidAmiName = "";
        NullPointerException exception = assertThrows(NullPointerException.class, () -> AppVersion.parseName(invalidAmiName));
        assertEquals("amiName", exception.getMessage());
    }

}