package org.jsoup.nodes;

public class GeneratedTestSize {

    private Attributes attributes;

    @Test
    public void testSize() {
        Attributes attributes1 = new Attributes();
        Attributes attributes2 = new Attributes();
        assertEquals(0, attributes1.size());
        assertEquals(0, attributes2.size());
        assertTrue(attributes1.isEmpty());
        assertTrue(attributes2.isEmpty());
        assertFalse(attributes1.hasDeclaredValueForKey("testKey"));
    }

}