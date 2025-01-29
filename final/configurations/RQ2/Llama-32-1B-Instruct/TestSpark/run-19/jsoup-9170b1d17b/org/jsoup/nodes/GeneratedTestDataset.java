package org.jsoup.nodes;

public class GeneratedTestDataset {

    private static final Document document = new Document();

    @Test
    public void testDataset() {
        String key = "test";
        Attributes attributes = new Attributes(document);
        Map<String, String> dataset = new AbstractMap<>();
        dataset.put("key1", "value1");
        attributes.dataset(dataset);
        assertEquals(1, attributes.size());
        assertEquals(dataset.get("key1"), attributes.dataset().get("key1"));
    }

}