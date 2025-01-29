package org.jsoup.helper;

public class GeneratedTest {

    @Test
    public void testBuild() throws UnsupportedEncodingException, MalformedURLException {
        String url = "https://example.com";
        String expectedUrl = url + "?key=value";
        StringBuilder sb = new StringBuilder();
        if (testAppendKeyVal(url)) {
            sb.append(url);
            sb.append("?key=");
            sb.append("value");
        }
        assertEquals(expectedUrl, sb.toString());
    }

    @Test
    public void testAppendKeyVal() throws UnsupportedEncodingException {
        String url = "https://example.com";
        StringBuilder sb = new StringBuilder();
        if (testAppendKeyVal(url)) {
            sb.append(url);
        } else {
            throw new AssertionError("Unexpected exception");
        }
        assertEquals(sb.toString(), url + "?key=value");
    }

    @Test
    public void testAppendUrlKeyVal() throws MalformedURLException {
        String url = "https://example.com";
        StringBuilder sb = new StringBuilder();
        if (testAppendUrlKeyVal(url)) {
            sb.append(url);
        } else {
            throw new AssertionError("Unexpected exception");
        }
        assertEquals(sb.toString(), url + "?key=value");
    }

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