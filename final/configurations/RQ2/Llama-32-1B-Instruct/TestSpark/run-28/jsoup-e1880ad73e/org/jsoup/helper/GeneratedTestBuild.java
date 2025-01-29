package org.jsoup.helper;

public class GeneratedTestBuild {

    private UrlBuilder underTest;

    @Before
    public void setUp() {
        String baseUrl = "http://example.com";
        URL inputUrl = new URI(baseUrl);
        underTest = new UrlBuilder(inputUrl);
    }

    @Test
    public void testBuild() {
        URL outputUrl = underTest.build();
        assertNotNull(outputUrl);
        try {
            new URL(new java.net.URL(url));
        } catch (MalformedURLException e) {
            fail("Failed to create a new URL: " + e.getMessage());
        }
    }

}