package org.jsoup.helper;

public class GeneratedTestDataMap {

    @Test
    public void testDataMap() {
        TestHttpConnection connection = new TestHttpConnection();
        assertEquals("https://example.com", connection.data(new LinkedHashMap<>() {{
            put("key1", "value1");
            put("key2", "value2");
        }}));
    }

}