package org.jsoup.helper;

public class GeneratedTestResponse_Protocol_Throw {

    private MockHttpConnection mockHttpConnection;

    @Before
    public void setUp() {
        mockHttpConnection = new MockHttpConnection();
    }

    @Test
    public void testResponse_Protocol_Throw() throws IOException {
        when(mockHttpConnection.connect(URL.parseString("http://example.com:443")).thenThrow(new MalformedURLException());

        try {
            mockHttpConnection.newRequest();
            fail("Expected exception to be thrown");
        } catch (MalformedURLException e) {
            // expected
        }
    }

}