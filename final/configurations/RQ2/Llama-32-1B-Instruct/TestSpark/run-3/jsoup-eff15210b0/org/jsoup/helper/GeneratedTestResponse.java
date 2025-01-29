package org.jsoup.helper;

public class GeneratedTestResponse {

    private MockHttpConnection mockHttpConnection;

    @Before
    public void setUp() {
        mockHttpConnection = new MockHttpConnection();
    }

    @Test
    public void testResponse() throws IOException {
        when(mockHttpConnection.connect(URL.parseString("http://example.com")).thenReturn(new Connection() {
            @Override
            public HttpURLConnection request() {
                return new HttpURLConnection();
            }
        });

        Connection connection = mockHttpConnection.newRequest();
        assertEquals(HEAD, connection.request().method());

        verify(mockHttpConnection).connect(URL.parseString("http://example.com"));
    }

}