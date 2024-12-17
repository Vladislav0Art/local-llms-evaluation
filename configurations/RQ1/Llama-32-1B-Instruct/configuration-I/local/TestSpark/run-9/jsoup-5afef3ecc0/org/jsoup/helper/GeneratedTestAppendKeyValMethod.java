package org.jsoup.helper;

public class GeneratedTestAppendKeyValMethod {

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

}