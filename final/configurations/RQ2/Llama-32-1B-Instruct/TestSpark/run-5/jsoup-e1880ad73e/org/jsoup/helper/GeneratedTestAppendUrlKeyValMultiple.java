package org.jsoup.helper;

public class GeneratedTestAppendUrlKeyValMultiple {

    @Test
    public void testAppendUrlKeyValMultiple() throws MalformedURLException {
        String url = "https://example.com";
        StringBuilder sb = new StringBuilder();
        if (testAppendUrlKeyVal(url)) {
            sb.append(url);
        } else {
            throw new AssertionError("Unexpected exception");
        }
        assertEquals(sb.toString(), url + "?key=value&key2=value2");
    }

    public boolean testAppendKeyVal(String url) {
        return url.contains("?key=");
    }

    public boolean testAppendUrlKeyVal(String url) {
        return url.contains("&key=");
    }

}