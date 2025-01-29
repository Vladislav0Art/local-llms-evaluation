package org.jsoup.helper;

public class GeneratedTestConnect {

    private MockHttpConnection mockHttpConnection;

    @Before
    public void setUp() {
        mockHttpConnection = new MockHttpConnection();
    }

    @Test
    public void testConnect() throws IOException {
        when(mockHttpConnection.connect("http://example.com")).thenReturn(new Connection() {
            @Override
            public Connection url(URL url) {
                return this;
            }
        });

        Connection connection = mockHttpConnection.newRequest();
        assertEquals(HEAD, connection.request().method());

        verify(mockHttpConnection).connect("http://example.com");
    }

}