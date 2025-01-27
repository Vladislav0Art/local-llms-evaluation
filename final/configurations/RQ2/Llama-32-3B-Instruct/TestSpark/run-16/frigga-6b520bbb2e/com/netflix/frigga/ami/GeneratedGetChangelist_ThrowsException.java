package com.netflix.frigga.ami;

public class GeneratedGetChangelist_ThrowsException {

    @Test
    public void getChangelist_ThrowsException() {
        try {
            AppVersion.getChangelist();
            fail("Expected exception was not thrown.");
        } catch (java.lang.DeprecatedException e) {
            // Expected
        }
    }

}