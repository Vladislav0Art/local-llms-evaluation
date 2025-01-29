package org.jsoup.helper;

public class GeneratedTestResponse_Protocol {

    private MockHttpConnection mockHttpConnection;

    @Before
    public void setUp() {
        mockHttpConnection = new MockHttpConnection();
    }

    @Test
    public void testResponse_Protocol() throws IOException {
        when(mockHttpConnection.connect(URL.parseString("http://example.com:443")).thenReturn(new Connection() {
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