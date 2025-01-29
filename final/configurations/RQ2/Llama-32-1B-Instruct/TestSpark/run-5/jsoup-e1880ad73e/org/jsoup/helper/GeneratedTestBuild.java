package org.jsoup.helper;

public class GeneratedTestBuild {

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

}