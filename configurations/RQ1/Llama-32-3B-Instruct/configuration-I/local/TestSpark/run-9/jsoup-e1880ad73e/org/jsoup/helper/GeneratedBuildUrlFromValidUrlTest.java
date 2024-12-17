package org.jsoup.helper;

public class GeneratedBuildUrlFromValidUrlTest {

    public static class MockUrlBuilder extends UrlBuilder {
        @Override
        public void appendKeyVal(Connection.KeyVal kv) throws UnsupportedEncodingException {
            // just return the StringBuilder, mock it later in a method call
        }
    }

    @Test
    public void buildUrlFromValidUrlTest() {
        URL inputUrl = new URL("http://test.com/path");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        assertEquals(inputUrl.toString(), builder.build().toString());
    }

}