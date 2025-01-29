package org.jsoup.helper;

public class GeneratedTestConnect_UA {

    private MockHttpConnection mockHttpConnection;

    @Before
    public void setUp() {
        mockHttpConnection = new MockHttpConnection();
    }

    @Test
    public void testConnect_UA() throws IOException {
        when(mockHttpConnection.connect(URL.parseString("http://example.com")).thenReturn(new Connection() {
            @Override
            public URL url(URL url) {
                return this;
            }
        });

        Connection connection = mockHttpConnection.newRequest();
        assertEquals(HEAD, connection.request().method());

        verify(mockHttpConnection).connect(URL.parseString("http://example.com"));
    }

}