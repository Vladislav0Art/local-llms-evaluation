package org.jsoup.helper;

public class GeneratedAppendKeyValUrlEncode {

    @Test
    public void appendKeyValUrlEncode() throws UnsupportedEncodingException {
        String inputKv = "key=value";
        String inputKey = "key1";
        String inputVal = "value1";

        URLBuilder urlBuilder = new UrlBuilder("https://example.com");

        try {
            URLBuilder.AppendKeyVal(urlBuilder, inputKv);
            assertEquals(inputKey + "=" + URLEncoder.encode(inputVal, UTF_8));
        } catch (UnsupportedEncodingException e) {
            fail(e.getMessage());
        }
    }

}