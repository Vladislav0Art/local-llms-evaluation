package com.adobe.epubcheck.opf;

public class GeneratedTestPreferredMedianWithInvalidPath {

    public static String getPreferredMediaType(String mediaType, String path) {
        // Implementation here
        return "";
    }
}

public class TestOpfChecker30 {

    @Test
    public void testPreferredMedianWithInvalidPath() {
        String result = OpfChecker30.getPreferredMedian("video", "invalid_path");
        assertEquals("video", result);
    }

}