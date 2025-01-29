package org.jsoup.nodes;

public class GeneratedTestDeduplicate {

    @Test
    public void testDeduplicate() throws Exception {
        String key1 = "attribute1";
        String key2 = "attribute1";

        Attributes attributes1 = new Attributes();
        attributes1.add(key1, "value1");

        Attributes attributes2 = new Attributes();
        attributes2.add(key2, "value2");

        assertEquals(1, attributes2.deduplicate(attributes1.normalize()).size());
    }

}