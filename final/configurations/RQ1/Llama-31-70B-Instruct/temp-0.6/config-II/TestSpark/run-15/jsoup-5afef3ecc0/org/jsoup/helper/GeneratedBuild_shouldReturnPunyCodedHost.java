package org.jsoup.helper;

public class GeneratedBuild_shouldReturnPunyCodedHost {

    private UrlBuilder urlBuilder;

    @Before
    public void setUp() throws Exception {
        urlBuilder = new UrlBuilder(new URL("http://example.com"));
    }

    @Test
    public void build_shouldReturnPunyCodedHost() throws Exception {
        URL url = urlBuilder.build();

        assertEquals("http://xn--e1afmkfd.xn--p1ai", url.toString());
    }

}