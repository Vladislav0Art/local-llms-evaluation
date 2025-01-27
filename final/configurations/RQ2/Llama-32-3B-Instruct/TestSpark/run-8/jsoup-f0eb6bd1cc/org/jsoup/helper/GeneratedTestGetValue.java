package org.jsoup.helper;

public class GeneratedTestGetValue {

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
    public void testGetValue() {
        System.out.println(ConnectionUtil.getValue("key"));
    }

}