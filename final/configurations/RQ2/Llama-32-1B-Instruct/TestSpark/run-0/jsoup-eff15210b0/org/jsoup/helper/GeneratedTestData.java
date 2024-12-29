package org.jsoup.helper;

public class GeneratedTestData {

    @Test
    public void testData() throws MalformedURLException {
        MockHttpConnection connection = new MockHttpConnection();
        assertEquals("https://example.com/data", connection.data("key=value"));
        fail("Expected IOException");
    }

}