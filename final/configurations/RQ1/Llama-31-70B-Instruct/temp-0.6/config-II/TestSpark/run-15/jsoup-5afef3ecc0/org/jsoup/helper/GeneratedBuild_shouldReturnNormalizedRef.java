package org.jsoup.helper;

public class GeneratedBuild_shouldReturnNormalizedRef {

    private UrlBuilder urlBuilder;

    @Before
    public void setUp() throws Exception {
        urlBuilder = new UrlBuilder(new URL("http://example.com"));
    }

    @Test
    public void build_shouldReturnNormalizedRef() throws Exception {
        urlBuilder.u.setRef("test ref");

        URL url = urlBuilder.build();

        assertEquals("%20test%20ref", url.getRef());
    }

}