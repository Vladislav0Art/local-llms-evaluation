package com.adobe.epubcheck.opf;

public class GeneratedTestPreferredMediaTypeWithInvalidPath {

    public static String getPreferredMediaType(String mediaType, String path) {
        // Implementation here
        return "";
    }
}

public class TestOpfChecker30 {

    @Test
    public void testPreferredMediaTypeWithInvalidPath() {
        String result = OpfChecker30.getPreferredMediaType("video", "invalid_path");
        assertEquals("video", result);
    }
}

}