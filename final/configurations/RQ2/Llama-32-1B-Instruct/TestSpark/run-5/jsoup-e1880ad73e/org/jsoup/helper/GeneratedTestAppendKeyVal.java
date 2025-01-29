package org.jsoup.helper;

public class GeneratedTestAppendKeyVal {

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

}