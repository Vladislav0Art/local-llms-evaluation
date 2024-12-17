package org.jsoup.helper;

public class GeneratedTestAppendKeyValNullQuerySlice {

    @Test
    public void testAppendKeyValNullQuerySlice() throws UnsupportedEncodingException {
        Builder<String> builder = new Builder<>(new URL("http://example.com/path?value"));
        String normUrl = builder.build().toString();
        assert normUrl.equals("http://example.com/path?value");
    }

}