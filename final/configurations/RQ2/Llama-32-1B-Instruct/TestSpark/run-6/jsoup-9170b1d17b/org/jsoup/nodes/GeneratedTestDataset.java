package org.jsoup.nodes;

public class GeneratedTestDataset {

    @Test
    public void testDataset() {
        Attributes attributes = new Attributes();
        String value = "value";
        attributes.put("key", value);
        Map<String, String> dataset = attributes.dataset();
        assertEquals(1, dataset.size());
        assertTrue(dataset.containsKey("key"));
        assertEquals(value, dataset.get("key"));
    }

}