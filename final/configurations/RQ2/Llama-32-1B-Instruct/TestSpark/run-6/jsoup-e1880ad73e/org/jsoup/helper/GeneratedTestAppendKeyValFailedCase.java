package org.jsoup.helper;

public class GeneratedTestAppendKeyValFailedCase {

    private static UrlBuilder underTest;

    @MockBean
    private Connection.KeyVal mockKeyVal;

    @Before
    public void setup() {
        underTest = new UrlBuilder("https://example.com/path");
        mockKeyVal = new MockedConnection.KeyVal();
    }

    public void testBuildSuccessfulUrl() {
        underTest.appendKeyVal(mockKeyVal);
        URI result = (URI) underTest.build();
        Mockito.verify(mockKeyVal, times(1)).put("key", "value");
        assertEquals("https://example.com/path", result.toString());
    }

    @Test
    public void testAppendKeyValFailedCase() {
        try {
            underTest.appendKeyVal(new MalformedURLException("invalid url"));
        } catch (UnsupportedEncodingException e) {
            Mockito.verify(mockUrlKey, never()).put();
        }
        assertEquals(null, (String) underTest.build().toString());
    }

    @MockBean
    private Connection.KeyVal mockDecodedUrlKey;

    public void testAppendKeyValSuccessfulCase() throws MalformedURLException {
        String url = "https://example.com/path";
        URI result = new URI(url);
        underTest.appendKeyVal(new MockedConnection.KeyVal(1, 2));
        Mockito.verify(mockDecodedUrlKey, times(1)).put();
        assertEquals("path=value", (String) underTest.build().toString());
    }

}