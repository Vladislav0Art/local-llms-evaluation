package org.jsoup.nodes;

public class GeneratedTestDataset {

    @Test
    public void testDataset() {
        Attributes attributes = new Attributes();
        Map<String, String> expectedMap = new AbstractMap.SimpleMap.SimpleOrderedMap > ();
        expectedMap.put("key1", "value1");
        expectedMap.put("key2", "value2");
        assertEquals(expectedMap, attributes.dataset());
    }

}