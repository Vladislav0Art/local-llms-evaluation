package org.jsoup.nodes;

public class GeneratedTestDataset_ReturnsAttributesMap {

    private Attributes attributes;

    @Test
    public void testDataset_ReturnsAttributesMap() {
        String key = "key1";
        Object value = null;
        attributes.put(key, value);
        Map<String, String> map = attributes.dataset();
        assertNotNull(map);
        assertEquals(1, map.size());
        assertTrue(map.containsKey("value1"));
    }

}