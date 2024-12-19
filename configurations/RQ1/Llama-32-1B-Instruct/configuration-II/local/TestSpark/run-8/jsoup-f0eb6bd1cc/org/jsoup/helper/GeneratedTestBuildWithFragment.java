package org.jsoup.helper;

public class GeneratedTestBuildWithFragment {

    private UrlBuilder urlBuilder;

    @Before
    void setUp() {
        urlBuilder = new UrlBuilder(null);
    }

    @Test
    public void testBuildWithFragment() throws UnsupportedEncodingException {
        URLBuilderUrlBuilder urlBuilderURLBuilder = new UrlBuilderURLBuilder(null);
        String q = "key=value#fragment";
        urlBuilderURLBuilder.q = StringUtil.borrowBuilder().append(q);
        assertEquals(new URI(
                urlBuilderURLBuilder.build().getScheme(),
                urlBuilderURLBuilder.build().getUserInfo(),
                null,
                urlBuilderURLBuilder.build().getPort(),
                urlBuilderURLBuilder.build().getPath(), q)
        );
    }

}