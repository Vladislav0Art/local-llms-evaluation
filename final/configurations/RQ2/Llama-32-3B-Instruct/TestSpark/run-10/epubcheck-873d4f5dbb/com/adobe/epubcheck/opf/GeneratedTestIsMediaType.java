package com.adobe.epubcheck.opf;

public class GeneratedTestIsMediaType {

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
    public void testIsMediaType() throws Exception {
        String type = "audio/mpeg";
        Object result = OPFChecker30.class.getMethod("getPreferredMediaType", String.class, String.class).invoke(null, type, "");
        assertEquals(type, result);
    }

}