package org.jsoup.helper;

public class GeneratedTestNormalizationRefMethod {

    @Mock
    private URL url;

    @Mocked
    private Connection.KeyVal keyVal = mock(Connection.KeyVal.class);

    @Test
    public void testNormalizationRefMethod() {
        when(url.parse(anyString())).thenReturn(new URL("https://example.com/path"));
        UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path?query=param&ref=ref");
        String r = "ref=ref";
        try {
            urlBuilder.build();
            Assert.assertEquals("ref%20ref", urlBuilder.normalizeRef(r));
        } catch (MalformedURLException e) {
            Assert.assertFalse(e.getMessage().contains("remote end will be able to handle it"));
        }
    }

}