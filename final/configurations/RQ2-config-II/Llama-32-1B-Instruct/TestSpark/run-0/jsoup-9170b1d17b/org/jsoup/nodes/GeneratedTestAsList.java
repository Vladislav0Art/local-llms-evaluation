package org.jsoup.nodes;

public class GeneratedTestAsList {

    private Attributes attributes;

    @Test
    public void testAsList() {
        Attributes attributes1 = new Attributes();
        attributes1.add("key", "value");
        Iterator<Attribute> iterator = attributes1.iterator();
        List<Attribute> expected = Arrays.asList(iterator.next());
        while (iterator.hasNext()) {
            expected.addAll(iterator.next().getAllAttributes());
        }
        assertEquals(expected, attributes1.asList());
    }

}