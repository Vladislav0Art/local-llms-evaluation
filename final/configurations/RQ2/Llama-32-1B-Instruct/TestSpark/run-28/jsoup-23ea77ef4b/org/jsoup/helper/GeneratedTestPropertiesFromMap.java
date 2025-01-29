package org.jsoup.helper;

public class GeneratedTestPropertiesFromMap {

    @Test
    public void testPropertiesFromMap() {
        Map<String, String> map = new HashMap<>();
        map.put("name", "test");
        org.jsoup.nodes.Document doc = new Document();
        String result = org.jsoup.helper.W3CDom.propertiesFromMap(map);
        assertEquals("name=test", result);
    }

}