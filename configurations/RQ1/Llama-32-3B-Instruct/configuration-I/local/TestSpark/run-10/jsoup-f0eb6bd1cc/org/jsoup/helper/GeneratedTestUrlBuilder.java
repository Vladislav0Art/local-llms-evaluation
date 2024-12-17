package org.jsoup.helper;

public class GeneratedTestUrlBuilder {

    @Test
    public void testUrlBuilder() {
        try {
            String url = "http://example.com/path?key=value";
            UrlBuilder builder = new UrlBuilder(new java.net.URL(url));
            assertEquals(1, builder.getQ().length());
            assertTrue(builder.getQ().toString().contains("?key=value"));
        } catch (MalformedURLException e) {
            fail("URLFormatException should not be thrown");
        }

        try {
            String url2 = "http://example.com/path?key1=value1&key2=value2";
            UrlBuilder builder2 = new UrlBuilder(new java.net.URL(url2));
            assertEquals(2, builder2.getQ().length());
            assertTrue(builder2.getQ().toString().contains("?key1=value1&key2=value2"));
        } catch (MalformedURLException e) {
            fail("URLFormatException should not be thrown");
        }
    }

    public static class UrlBuilder {
        private StringBuilder q;

        public UrlBuilder(String url) throws MalformedURLException {
            this.q = new StringBuilder();
            q.append(url);
        }

        public String getQ() {
            return q.toString();
        }
    }

}