package org.jsoup.nodes;

public class GeneratedTestAddToArray {

    @Test
    public void testAddToArray() {
        Attributes attributes = new Attributes();
        String key = "key";
        String value = "value";
        List<Attribute> attributesList = new ArrayList<>();
        attributesList.add(new AttrUtils.TestAttribute("key", "value"));
        attributes.addAll(attributesList);
        assertEquals(1, attributes.size());
    }

}