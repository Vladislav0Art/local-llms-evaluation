package org.jsoup.helper;

public class GeneratedTestBuildSuccessfulUrlWithPath {

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
    public void testBuildSuccessfulUrlWithPath() {
        underTest.appendKeyVal(mockKeyVal);
        URI result = (URI) underTest.build();
        Mockito.verify(mockKeyVal, times(1)).put("path", "value");
        assertEquals("https://example.com/path", result.toString());
    }

    @MockBean
    private Connection.KeyVal mockUrlKey;

    public void testAppendKeyVal() {
        underTest.appendKeyVal(mockUrlKey);
        Mockito.verify(mockUrlKey, times(1)).put();
    }

    @Before
    public void setup2() {
        underTest = new UrlBuilder("https://example.com/path");
        mockUrlKey = new MockedConnection.KeyVal();
    }

    public void testAppendKeyValSuccessfulCase() {
        underTest.appendKeyVal(mockUrlKey);
        Mockito.verify(mockUrlKey, times(1)).put();
        assertEquals("https://example.com/path", (String) underTest.build().toString());
    }

}