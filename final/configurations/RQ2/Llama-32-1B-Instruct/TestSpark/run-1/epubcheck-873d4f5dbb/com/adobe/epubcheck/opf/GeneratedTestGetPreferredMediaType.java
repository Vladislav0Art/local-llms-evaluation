package com.adobe.epubcheck.opf;

public class GeneratedTestGetPreferredMediaType {

    @Test
    public void testGetPreferredMediaType() {
        OPFChecker30 checker = new OPFChecker30(null);
        // Test case: Check if the method returns a string.
        String path = "test-path";
        String result = checker.getPreferredMediaType("audio/x-m4a", path);
        Assert.assertTrue(result != null);

        // Test case: Check if the method throws NullPointerException when given an empty string.
        try {
            checker.getPreferredMediaType("", "");
            Assert.fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException e) {
            Assert.assertTrue(true);
        }
    }

}