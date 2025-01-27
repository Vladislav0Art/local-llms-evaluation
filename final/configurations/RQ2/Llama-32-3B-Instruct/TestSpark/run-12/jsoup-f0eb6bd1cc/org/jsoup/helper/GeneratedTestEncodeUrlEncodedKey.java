package org.jsoup.helper;

public class GeneratedTestEncodeUrlEncodedKey {

    public static String encode(String str) {
        return str;
    }
}

public class Connection {
    public interface KeyVal {
    }
}

public class MainTest {

    @Test
    public void testEncodeUrlEncodedKey() {
        String urlEncodedKey = StringUtil.encode("key");
        assertEquals("key", urlEncodedKey);
    }

}