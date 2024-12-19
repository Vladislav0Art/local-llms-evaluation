package org.jsoup.helper;

public class GeneratedTestBuildWithoutFragment {

    private UrlBuilder urlBuilder;

    @Before
    void setUp() {
        urlBuilder = new UrlBuilder(null);
    }

    @Test
    public void testBuildWithoutFragment() throws UnsupportedEncodingException {
        URLBuilderUrlBuilder urlBuilderURLBuilder = new UrlBuilderURLBuilder(null);
        String normUrl = urlBuilderURLBuilder.build().toString();
        assertEquals(new URI(
                urlBuilderURLBuilder.build().getScheme(),
                urlBuilderURLBuilder.build().getUserInfo(),
                null,
                urlBuilderURLBuilder.build().getPort(),
                null,
                null))
		);
    }

}