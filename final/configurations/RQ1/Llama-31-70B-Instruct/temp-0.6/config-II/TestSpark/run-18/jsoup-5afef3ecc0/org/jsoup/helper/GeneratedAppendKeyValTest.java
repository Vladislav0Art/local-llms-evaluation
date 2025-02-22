package org.jsoup.helper;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() {
        URL inputUrl = new URL("https://example.com/page");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        try {
            builder.appendKeyVal(new Connection.KeyVal("param1", "value1"));
        } catch (UnsupportedEncodingException e) {
            fail();
        }
        URL expected = new URL("https://example.com/page?param1=value1");
        URL actual = builder.build();
        assertEquals(expected, actual);
    }

}