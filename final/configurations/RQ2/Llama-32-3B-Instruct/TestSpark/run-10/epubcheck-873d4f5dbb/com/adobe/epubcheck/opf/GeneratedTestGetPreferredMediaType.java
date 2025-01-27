package com.adobe.epubcheck.opf;

public class GeneratedTestGetPreferredMediaType {

    public static String getPreferredMediaType(String type, String path) {
        // implementation
        return "";
    }

    public static boolean isCoreMediaType(String type) {
        // implementation
        return false;
    }
}

public class Test {

    @Test
    public void testGetPreferredMediaType() throws Exception {
        String type = "application/pdf";
        String path = "/path/to/file.pdf";
        Object result = OPFChecker30.class.getMethod("getPreferredMediaType", String.class, String.class).invoke(null, type, path);
        assertEquals(type, ((String) result));
    }

}