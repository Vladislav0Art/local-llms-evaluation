package org.jsoup.helper;

public class GeneratedTestMaxBodySize {

    @Test
    public void testMaxBodySize() throws IOException {
        MockHttpConnection connection = new MockHttpConnection();
        assertEquals(1024, connection.maxBodySize(1024), 1);
    }

}