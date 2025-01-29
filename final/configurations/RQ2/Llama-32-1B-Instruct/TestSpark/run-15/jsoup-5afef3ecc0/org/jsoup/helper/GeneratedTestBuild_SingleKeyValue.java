package org.jsoup.helper;

public class GeneratedTestBuild_SingleKeyValue {

    private final MockUrl url;
    private final Jsoup jsoup;

    @Before
    public void setup() {
        url = new MockUrl("https://example.com", "/path/to/resource");
        jsoup = Jsoup.create(url);
    }

    @Test
    public void testBuild_SingleKeyValue() throws UnsupportedEncodingException {
        URL result = url.build();
        assertNotNull(result);
        URI uri = result.getScheme().toURI();
        assertEquals("http", uri.getScheme());
        assertEquals("/path/to/resource", uri.getPath());
    }

}