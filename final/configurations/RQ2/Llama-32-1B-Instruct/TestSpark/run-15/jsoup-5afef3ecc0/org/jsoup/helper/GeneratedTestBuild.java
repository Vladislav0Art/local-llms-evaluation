package org.jsoup.helper;

public class GeneratedTestBuild {

    private final UrlBuilder urlBuilder;
    private final MockUrl url;

    @Before
    public void setup() {
        url = mock(URL.class);
        urlBuilder = new UrlBuilder(url);
    }

    @Test
    public void testBuild() throws UnsupportedEncodingException {
        URL result = urlBuilder.build();
        assertNotNull(result);
        URI uri = result.getScheme().toURI();
        assertEquals("http", uri.getScheme());
        assertEquals("/path/to/resource", uri.getPath());
    }

}