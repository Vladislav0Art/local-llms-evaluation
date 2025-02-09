package org.jsoup.helper;

public class GeneratedTestParseXml {

    @Test
    public void testParseXml() {
        String xmlString = "<root><person><name>John Doe</name><age>30</age></person></root>";
        Document document = W3CDom.parse(xmlString);
        assertEquals("John Doe", document.querySelector("name").getText());
        assertEquals(30, Integer.parseInt(document.querySelector("age").getText()));
    }

}