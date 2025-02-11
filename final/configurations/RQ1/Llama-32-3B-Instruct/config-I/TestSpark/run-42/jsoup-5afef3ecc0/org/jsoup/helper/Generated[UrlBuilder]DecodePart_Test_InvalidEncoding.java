package org.jsoup.helper;

public class Generated[UrlBuilder]

DecodePart_Test_InvalidEncoding {

    @Test
    public void [UrlBuilder]DecodePart_Test_InvalidEncoding() throws UnsupportedEncodingException {
        String encoded = "";
        try {
            UrlBuilder.decodePart(encoded);
            assert false;
        } catch (RuntimeException e) {
        }
    }

}