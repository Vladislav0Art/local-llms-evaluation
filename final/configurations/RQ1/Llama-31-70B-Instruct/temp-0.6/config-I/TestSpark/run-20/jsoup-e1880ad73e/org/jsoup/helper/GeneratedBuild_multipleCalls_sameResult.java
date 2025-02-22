package org.jsoup.helper;

public class GeneratedBuild_multipleCalls_sameResult {

    private UrlBuilder urlBuilder;

    @Before
    public void setUp() {
        urlBuilder = new UrlBuilder();
    }

    @Test
    public void build_multipleCalls_sameResult() {
        URL inputUrl = new URL("http://www.example.com");
        urlBuilder.u = inputUrl;

        URL result1 = urlBuilder.build();
        URL result2 = urlBuilder.build();

        assertEquals(result1, result2);
    }

}