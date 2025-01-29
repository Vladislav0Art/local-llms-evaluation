package org.jsoup.nodes;

public class GeneratedTestGetAllAttributes {

    @Test
    public void testGetAllAttributes() {
        Attributes attributes = new Attributes();
        String value = "value";
        attributes.put("key", value);
        Object[] allAttributes = attributes.getAllAttributes();
        assertEquals(1, allAttributes.length);
        assertTrue(Arrays.asList(allAttributes).contains(value));
    }

}