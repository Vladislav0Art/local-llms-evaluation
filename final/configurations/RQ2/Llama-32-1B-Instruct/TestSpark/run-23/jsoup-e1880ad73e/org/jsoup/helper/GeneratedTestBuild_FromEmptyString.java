package org.jsoup.helper;

public class GeneratedTestBuild_FromEmptyString {

    private static String inputUrl;

    @Before
    public void setup() {
        // Nothing to set up, just for initialization
    }

    @Test
    public void testBuild_FromEmptyString() {
        inputUrl = "https://example.com";
        URL url = new UrlBuilder(inputUrl).build();
        assert url != null;
    }

}