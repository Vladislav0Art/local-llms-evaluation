package org.jsoup.nodes;

public class GeneratedTestGetIgnoreCase {

    @Test
    public void testGetIgnoreCase() {
        String attrKey = "test";
        Attribute attr = new Attr();
        String expectedValue = "TEST";
        assertEquals(expectedValue, attr.getIgnoreCase(attrKey));
    }

}