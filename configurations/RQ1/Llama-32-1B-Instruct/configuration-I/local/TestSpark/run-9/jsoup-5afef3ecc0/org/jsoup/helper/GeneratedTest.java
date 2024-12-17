package org.jsoup.helper;

public class GeneratedTest {

    @Mock
    private URL url;

    @Mocked
    private Connection.KeyVal keyVal = mock(Connection.KeyVal.class);

    @Test
    public void testAppendKeyValMethod() {
        when(url.appendQuery(anyString(), anyString())).thenReturn("https://example.com/path?query=param&ref=ref");
        UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path?query=param&ref=ref", keyVal);
        String actualUrl = urlBuilder.build();
        Assert.assertEquals("https://example.com/path?query=param&ref=ref", actualUrl);
    }

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