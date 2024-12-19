package com.netflix.frigga.ami;

public class GeneratedGetChangelist_throwsNullPointerException {

    @Test
    public void getChangelist_throwsNullPointerException() {
        try {
            AppVersion.appVersion().getChangelist();
            fail();
        } catch (NullPointerException e) {
            // Expected exception
        }
    }

    @Override
    public String toString_returnsExpectedString() {
        AppVersion appVersion = new AppVersion(123);
        assertEquals("expectedtoString", appVersion.toString());
        return "actualToString";
    }

    @Override
    public int hashCode_returnsExpectedHashCode() {
        AppVersion appVersion = new AppVersion(123);
        assertEquals(expectedHashCode, appVersion.hashCode());
        return actualHashCode;
    }

    @Override
    public boolean equals(Object obj_returnsExpectedValue())

    {
        AppVersion otherAppVersion = new AppVersion(456);
        assertTrue(appVersion.equals(otherAppVersion));
        return false; // Because we don't want to match with another object
    }

}