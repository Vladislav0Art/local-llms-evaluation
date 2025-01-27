package org.jsoup.helper;

public class GeneratedTestGetScheme {

    private static final String TEST_URL = "http://example.com";

    public static String getScheme() {
        return java.net.URL.getProtocol().replace(":", "");
    }

    public static String getValue(String key) {
        return java.net.URL.getProtocol().replace(":", "");
    }
}

public class TestConnectionUtil {

    @Test
    public void testGetScheme() {
        System.out.println(ConnectionUtil.getScheme());
    }

}