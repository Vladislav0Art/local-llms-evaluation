package com.adobe.epubcheck.opf;

public class GeneratedTestIsCoreMediaType {

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