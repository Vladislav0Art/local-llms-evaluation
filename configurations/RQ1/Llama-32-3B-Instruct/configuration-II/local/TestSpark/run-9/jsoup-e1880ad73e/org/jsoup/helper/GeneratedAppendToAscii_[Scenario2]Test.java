package org.jsoup.helper;

public class GeneratedAppendToAscii_[Scenario2]

Test {

    @Test
    public void appendToAscii_[ Scenario2]Test() {
        String s = "test";
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com/path/to/resource"));
        StringBuilder sb = new StringBuilder();
        appendToAscii(s, false, sb);
        assertEquals("%20", sb.toString());
    }

}