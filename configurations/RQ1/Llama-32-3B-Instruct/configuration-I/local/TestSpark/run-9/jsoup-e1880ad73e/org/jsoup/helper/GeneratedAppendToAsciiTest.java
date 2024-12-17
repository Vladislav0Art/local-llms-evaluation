package org.jsoup.helper;

public class GeneratedAppendToAsciiTest {

    public static class MockUrlBuilder extends UrlBuilder {
        @Override
        public void appendKeyVal(Connection.KeyVal kv) throws UnsupportedEncodingException {
            // just return the StringBuilder, mock it later in a method call
        }
    }

    @Test
    public void appendToAsciiTest() {
        String str = "Hello World!";
        UrlBuilder builder = new UrlBuilder(null);
        StringBuilder sb = new StringBuilder();
        builder.appendToAscii(str, false, sb);
        assertEquals("Hello%20World!", sb.toString());
    }

}