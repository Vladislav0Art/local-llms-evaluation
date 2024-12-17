package org.jsoup.helper;

public class GeneratedTestNormalizationQueryMethod {

    @Mock
    private URL url;

    @Mocked
    private Connection.KeyVal keyVal = mock(Connection.KeyVal.class);

    @Test
    public void testNormalizationQueryMethod() {
        when(url.parse(anyString())).thenReturn(new URL("https://example.com/path"));
        UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path?query=param&ref=ref");
        String q = "key=value&ref=ref";
        try {
            urlBuilder.build();
            Assert.assertEquals("key=value&ref=ref", urlBuilder.normalizeQuery(q));
        } catch (MalformedURLException e) {
            Assert.assertFalse(e.getMessage().contains("remote end will be able to handle it"));
        }
    }

}