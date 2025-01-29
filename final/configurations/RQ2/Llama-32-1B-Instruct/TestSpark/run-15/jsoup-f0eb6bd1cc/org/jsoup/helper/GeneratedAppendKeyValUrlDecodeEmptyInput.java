package org.jsoup.helper;

public class GeneratedAppendKeyValUrlDecodeEmptyInput {

    @Test
    public void appendKeyValUrlDecodeEmptyInput() throws UnsupportedEncodingException {
        String inputKv = "key=value";
        String inputKey = "";
        String inputVal = "value1";

        UrlBuilder urlBuilder = new UrlBuilder("https://example.com");

        try {
            URLBuilder.AppendKeyVal(urlBuilder, inputKv);
            assertEquals(URLDecoder.decode(inputKey + "=" + URLEncoder.encode(inputVal, UTF_8), UTF_8));
        } catch (UnsupportedEncodingException e) {
            fail(e.getMessage());
        }
    }

}