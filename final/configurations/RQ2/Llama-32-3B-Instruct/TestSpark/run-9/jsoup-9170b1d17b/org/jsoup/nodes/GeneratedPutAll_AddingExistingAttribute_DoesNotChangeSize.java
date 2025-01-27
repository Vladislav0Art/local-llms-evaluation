package org.jsoup.nodes;

public class GeneratedPutAll_AddingExistingAttribute_DoesNotChangeSize {

    @Test
    public void putAll_AddingExistingAttribute_DoesNotChangeSize() {
        Attributes incoming = new Attributes();
        Attribute attribute1 = new Attribute("key1", "value1");
        Attribute attribute2 = new Attribute("key2", "value2");
        incoming.addAll(attribute1);
        Attributes attributes = new Attributes();
        attributes.addAll(incoming);
        assertEquals(0, attributes.size());
    }

}