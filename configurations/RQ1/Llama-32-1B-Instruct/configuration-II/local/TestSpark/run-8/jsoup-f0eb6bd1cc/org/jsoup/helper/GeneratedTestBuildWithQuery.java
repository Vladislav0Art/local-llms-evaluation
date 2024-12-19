package org.jsoup.helper;

public class GeneratedTestBuildWithQuery {

    private UrlBuilder urlBuilder;

    @Before
    void setUp() {
        urlBuilder = new UrlBuilder(null);
    }

    @Test
    public void testBuildWithQuery() throws UnsupportedEncodingException {
        URLBuilderURLBuilder urlBuilderURLBuilder = new UrlBuilderURLBuilder(null);
        String q = "key=value";
        urlBuilderURLBuilder.q = StringUtil.borrowBuilder().append(q);
        assertEquals(new URI(
                urlBuilderURLBuilder.build().getScheme(),
                urlBuilderURLBuilder.build().getAuthority(),
                urlBuilderURLBuilder.build().getUserInfo(),
                null,
                null,
                URLEncoder.encode(urlBuilderURLBuilder.build().getPath(), UTF_8.name()))
        );
    }

}