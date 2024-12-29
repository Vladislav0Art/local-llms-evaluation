package org.jsoup.helper;

public class GeneratedTestData {

    @Test
    public void testData() {
        MockHttpConnection mock = new MockHttpConnection();
        String actual = mock.data("key1", "value1");
        assertEquals(actual, mock);
    }

}