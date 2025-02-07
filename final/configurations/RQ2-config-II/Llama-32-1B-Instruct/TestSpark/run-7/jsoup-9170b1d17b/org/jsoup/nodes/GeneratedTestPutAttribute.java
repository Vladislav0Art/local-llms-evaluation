package org.jsoup.nodes;

public class GeneratedTestPutAttribute {

    @Test
    public void testPutAttribute() {
        Attributes attributes = new Attributes();
        Attribute attribute = new Attributes().put("attr", "value");
        assertEquals(attribute, attributes.getUserData("attr"));
    }

}