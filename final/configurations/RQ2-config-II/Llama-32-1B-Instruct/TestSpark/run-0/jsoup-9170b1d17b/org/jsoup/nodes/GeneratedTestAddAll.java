package org.jsoup.nodes;

public class GeneratedTestAddAll {

    private Attributes attributes;

    @Test
    public void testAddAll() {
        List<Attribute> attributesList = Arrays.asList(new Attribute(), new Attribute(), new Attribute());
        Attributes expected = new Attributes();
        for (Attribute attribute : attributesList) {
            expected.add(attribute.getKey(), attribute.getValue());
        }
        Iterator<Attribute> iterator = attributes.iterator();
        while (iterator.hasNext()) {
            iterator.next().addKey(iterator.get().getKey(), iterator.get().getValue());
        }
        assertEquals(expected, attributes);
    }

}