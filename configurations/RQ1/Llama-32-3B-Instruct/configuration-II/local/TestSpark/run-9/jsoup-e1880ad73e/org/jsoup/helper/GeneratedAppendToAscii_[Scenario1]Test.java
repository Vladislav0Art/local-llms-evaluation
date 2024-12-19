package org.jsoup.helper;

public class GeneratedAppendToAscii_[Scenario1]

Test {

    @Test
    public void appendToAscii_[ Scenario1]Test() {
        String s = "test";
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com/path/to/resource"));
        StringBuilder sb = new StringBuilder();
        appendToAscii(s, true, sb);
        assertEquals("%20", sb.toString());
    }

}