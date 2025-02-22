package org.jsoup.helper;

public class GeneratedTest {

    @Test
    public void buildTest() {
        URL inputUrl = new URL("https://example.com/page");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL expected = new URL("https://example.com/page");
        URL actual = builder.build();
        assertEquals(expected, actual);
    }

    @Test
    public void buildWithQueryTest() {
        URL inputUrl = new URL("https://example.com/page?param1=value1&param2=value2");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL expected = new URL("https://example.com/page?param1=value1&param2=value2");
        URL actual = builder.build();
        assertEquals(expected, actual);
    }

    @Test
    public void buildWithQueryAndRefTest() {
        URL inputUrl = new URL("https://example.com/page?param1=value1&param2=value2#fragment");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL expected = new URL("https://example.com/page?param1=value1&param2=value2#fragment");
        URL actual = builder.build();
        assertEquals(expected, actual);
    }

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