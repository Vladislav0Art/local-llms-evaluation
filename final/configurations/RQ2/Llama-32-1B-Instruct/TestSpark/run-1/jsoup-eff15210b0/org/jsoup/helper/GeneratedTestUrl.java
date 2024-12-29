package org.jsoup.helper;

public class GeneratedTestUrl {

    @Test
    public void testUrl() {
        MockHttpConnection mock = new MockHttpConnection();
        URL actual = mock.url("http://www.example.com");
        assertEquals(actual, mock);
    }

}