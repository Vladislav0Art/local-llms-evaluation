package org.jsoup.helper;

public class GeneratedTestConnect_UA_Throw {

    private MockHttpConnection mockHttpConnection;

    @Before
    public void setUp() {
        mockHttpConnection = new MockHttpConnection();
    }

    @Test
    public void testConnect_UA_Throw() throws IOException {
        when(mockHttpConnection.connect(URL.parseString("http://example.com"))).thenThrow(new MalformedURLException());

        try {
            mockHttpConnection.newRequest();
            fail("Expected exception to be thrown");
        } catch (MalformedURLException e) {
            // expected
        }
    }

}