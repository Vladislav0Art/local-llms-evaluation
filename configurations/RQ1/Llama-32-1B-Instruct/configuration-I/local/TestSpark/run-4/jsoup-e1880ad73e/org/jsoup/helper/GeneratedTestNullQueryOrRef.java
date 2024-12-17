package org.jsoup.helper;

public class GeneratedTestNullQueryOrRef {

    @Test
    public void testNullQueryOrRef() {
        final URLBuilder builder = new UrlBuilder(null);
        assert builder.q == null;
        try {
            builder.appendKeyVal(new KeyVal());
        } catch (UnsupportedEncodingException e) {
            fail("Expected URISyntaxException");
        }
    }

}