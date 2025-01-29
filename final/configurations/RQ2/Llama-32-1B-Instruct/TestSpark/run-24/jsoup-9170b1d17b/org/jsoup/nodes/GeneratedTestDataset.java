package org.jsoup.nodes;

public class GeneratedTestDataset {

    @Test
    public void testDataset() {
        Attributes attributes = new Attributes();
        String dataset = "{\"key\":\"value\"}";
        Map<String, String> map = attributes.dataset(dataset);
        assertEquals("value", map.get("key"));
        assertEquals("", map.get("otherKey"));
    }

}