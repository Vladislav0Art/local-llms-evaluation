package org.jsoup.helper;

public class GeneratedTestAppendKeyValSuccessfulCaseWithValues {

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
    public void testAppendKeyValSuccessfulCaseWithValues() throws MalformedURLException {
        String url = "https://example.com/path";
        URI result = new URI(url);
        underTest.appendKeyVal(new MockedConnection.KeyVal(1, 2));
        Mockito.verify(mockDecodedUrlKey, times(1)).put();
        assertEquals("path=1=value", (String) underTest.build().toString());
    }

    @MockBean
    private Connection.KeyVal mockEncodedUrlKey;

    public void testAppendKeyValSuccessfulCaseWithValues() throws MalformedURLException {
        String url = "https://example.com/path";
        URI result = new URI(url);
        underTest.appendKeyVal(new MockedConnection.KeyVal(1, 2));
        Mockito.verify(mockEncodedUrlKey, times(1)).put();
        assertEquals("path%3D1%26value", (String) underTest.build().toString());
    }

    @MockBean
    private Connection.KeyVal mockDecodedUrlKey;

    public void testAppendKeyValSuccessfulCaseWithValues() throws MalformedURLException {
        String url = "https://example.com/path";
        URI result = new URI(url);
        underTest.appendKeyVal(new MockedConnection.KeyVal(1, 2));
        Mockito.verify(mockDecodedUrlKey, times(1)).put();
        assertEquals("path=1=value", (String) underTest.build().toString());
    }

    @MockBean
    private Connection.KeyVal mockEncodedUrlKeyWithException;

    public void testAppendKeyValSuccessfulCaseWithValuesAndExcept() throws MalformedURLException {
        String url = "https://example.com/path";
        URI result = new URI(url);
        underTest.appendKeyVal(new MockedConnection.KeyVal(1, 2));
        Mockito.verify(mockEncodedUrlKeyWithException, times(1)).put();
        assertEquals("path%3D1%26value", (String) underTest.build().toString());
    }

    @MockBean
    private Connection.KeyVal mockDecodedUrlKeyWithException;

    public void testAppendKeyValSuccessfulCaseWithValuesAndExcept() throws MalformedURLException {
        String url = "https://example.com/path";
        URI result = new URI(url);
        underTest.appendKeyVal(new MockedConnection.KeyVal(1, 2));
        Mockito.verify(mockDecodedUrlKeyWithException, times(1)).put();
        assertEquals("path%3D1%26value", (String) underTest.build().toString());
    }

    @MockBean
    private Connection.KeyVal mockEncodedUrlKeyWithMalformed;

    public void testAppendKeyValSuccessfulCaseWithValuesAndExcept() throws MalformedURLException {
        String url = "https://example.com/path";
        URI result = new URI(url);
        underTest.appendKeyVal(new MockedConnection.KeyVal(1, 2));
        Mockito.verify(mockEncodedUrlKeyWithMalformed, times(1)).put();
        assertEquals("path%3D1%26value", (String) underTest.build().toString());
    }

}