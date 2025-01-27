package com.adobe.epubcheck.opf;

public class GeneratedTestPreferredMediaType {

    public static String getPreferredMediaType(String mediaType, String path) {
        // Implementation here
        return "";
    }
}

public class TestOpfChecker30 {

    @Test
    public void testPreferredMediaType() {
        AssertThrows(NullPointerException.class, () -> OpfChecker30.getPreferredMediaType(null, "path"));
    }

}