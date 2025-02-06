package org.jsoup.helper;

public class GeneratedPropertiesFromMapReturnsProperties {

    @Test
    public void propertiesFromMapReturnsProperties() {
        Map<String, String> map = new HashMap<>();
        Properties properties = W3CDom.propertiesFromMap(map);
        assertNotNull(properties);
    }

}