package org.jsoup.helper;

public class GeneratedTestEncodeUrlEncodedValue {

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
    public void testEncodeUrlEncodedValue() {
        String urlEncodedValue = StringUtil.encode("value");
        assertEquals("value", urlEncodedValue);
    }

}