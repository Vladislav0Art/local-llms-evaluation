package org.jsoup.helper;

public class GeneratedTestConnect_Protocol {

    private MockHttpConnection mockHttpConnection;

    @Before
    public void setUp() {
        mockHttpConnection = new MockHttpConnection();
    }

    @Test
    public void testConnect_Protocol() throws IOException {
        when(mockHttpConnection.connect("http://example.com:443")).thenReturn(new Connection() {
            @Override
            public URL url(URL url) {
                return this;
            }
        });

        Connection connection = mockHttpConnection.newRequest();
        assertEquals(HEAD, connection.request().method());

        verify(mockHttpConnection).connect("http://example.com:443");
    }

}