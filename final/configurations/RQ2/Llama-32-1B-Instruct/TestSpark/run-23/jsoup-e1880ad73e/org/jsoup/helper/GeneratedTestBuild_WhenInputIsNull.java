package org.jsoup.helper;

public class GeneratedTestBuild_WhenInputIsNull {

    private static String inputUrl;

    @Before
    public void setup() {
        // Nothing to set up, just for initialization
    }

    @Test
    public void testBuild_WhenInputIsNull() {
        assertNotNull(inputUrl);
        Url url = new UrlBuilder(null).build();
        assert url == null;
    }

}