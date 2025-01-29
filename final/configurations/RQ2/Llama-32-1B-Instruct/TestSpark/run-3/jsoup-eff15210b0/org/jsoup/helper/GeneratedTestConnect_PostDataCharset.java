package org.jsoup.helper;

public class GeneratedTestConnect_PostDataCharset {

    private MockHttpConnection mockHttpConnection;

    @Before
    public void setUp() {
        mockHttpConnection = new MockHttpConnection();
    }

    @Test
    public void testConnect_PostDataCharset() throws IOException {
        when(mockHttpConnection.connect(URL.parseString("http://example.com")).thenReturn(new Connection() {
            @Override
            public HttpURLConnection request() {
                return new HttpURLConnection();
            }
        });

        try {
            mockHttpConnection.newRequest();
            fail("Expected exception to be thrown");
        } catch (IOException e) {
            // expected
        }
    }

}