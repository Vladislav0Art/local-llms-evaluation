package org.jsoup.helper;

public class GeneratedTestBuildMethod {

    @Mock
    private URL url;

    @Mocked
    private Connection.KeyVal keyVal = mock(Connection.KeyVal.class);

    @Test
    public void testBuildMethod() {
        when(url.parse(anyString())).thenReturn(new URL("https://example.com/path"));
        UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path?query=param&ref=ref");
        try {
            urlBuilder.build();
            fail("Expected exception not thrown");
        } catch (MalformedURLException e) {
            Assert.assertTrue(e.getMessage().contains("remote end will be able to handle it"));
        }
    }

}