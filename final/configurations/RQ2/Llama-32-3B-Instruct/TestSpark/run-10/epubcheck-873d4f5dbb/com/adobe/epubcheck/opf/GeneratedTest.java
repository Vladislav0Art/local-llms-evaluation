package com.adobe.epubcheck.opf;

public class GeneratedTest {

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

    @Test
    public void testGetPreferredMediaType() throws Exception {
        String type = "application/pdf";
        String path = "/path/to/file.pdf";
        Object result = OPFChecker30.class.getMethod("getPreferredMediaType", String.class, String.class).invoke(null, type, path);
        assertEquals(type, ((String) result));
    }

    @Test
    public void testIsCoreMediaType() throws Exception {
        String type = "application/pdf";
        Object result = OPFChecker30.class.getMethod("isCoreMediaType", String.class).invoke(null, type);
        assertTrue((Boolean) result);
    }
}

public class Main {
    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("GeneratedTest");
    }

}