package org.jsoup.helper;

public class GeneratedTestAppendUrlKeyVal {

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

}