package org.jsoup.nodes;

public class GeneratedTestDeduplicate {

    private Attributes attributes;

    @Test
    public void testDeduplicate() {
        Attributes expected = new Attributes();
        List<Attribute> list1 = Arrays.asList(new Attribute(), new Attribute());
        List<Attribute> list2 = new ArrayList<>();
        for (Attribute attribute : list1) {
            list2.add(attribute);
        }
        assertEquals(expected, deduplicate(list1).asList());
    }

}