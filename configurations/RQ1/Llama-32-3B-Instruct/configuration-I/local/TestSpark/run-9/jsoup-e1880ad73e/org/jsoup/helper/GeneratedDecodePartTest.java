package org.jsoup.helper;

public class GeneratedDecodePartTest {

    public static class MockUrlBuilder extends UrlBuilder {
        @Override
        public void appendKeyVal(Connection.KeyVal kv) throws UnsupportedEncodingException {
            // just return the StringBuilder, mock it later in a method call
        }
    }

    @Test
    public void decodePartTest() throws UnsupportedEncodingException {
        String part = "%20";
        String decodedPart = UrlBuilder.decodePart(part);
        assertEquals(" ", decodedPart);
    }

}