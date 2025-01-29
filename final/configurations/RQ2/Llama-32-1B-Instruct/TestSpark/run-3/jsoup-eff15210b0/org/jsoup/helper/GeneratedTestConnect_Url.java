package org.jsoup.helper;

public class GeneratedTestConnect_Url {

    private MockHttpConnection mockHttpConnection;

    @Before
    public void setUp() {
        mockHttpConnection = new MockHttpConnection();
    }

    @Test
    public void testConnect_Url() throws IOException {
        when(mockHttpConnection.connect(URL.parseString("http://example.com))).thenReturn(new Connection() {
        @Override
        public URL url (URL url){
            return this;
        }
    });

    Connection connection = mockHttpConnection.newRequest();

    assertEquals(HEAD, connection.request().

    method());

    verify(mockHttpConnection).

    connect("http://example.com");
}

}