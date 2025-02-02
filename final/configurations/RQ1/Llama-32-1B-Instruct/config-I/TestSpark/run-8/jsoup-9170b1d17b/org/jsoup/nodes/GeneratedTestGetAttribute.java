package org.jsoup.nodes;

public class GeneratedTestGetAttribute {

    private String dataPrefix;
    private String internalPrefix;

    public GeneratedTest() {
        this.dataPrefix = "data";
        this.internalPrefix = "";
    }

    @Test
    public void testGetAttribute() throws ParseException {
        assertEquals(dataPrefix, getAttr("a"));
        assertEquals(internalPrefix, getAttr("b".repeat(1)));
        assertEquals(dataPrefix + internalPrefix, keys[0]);
        for (int i = 1; i < keys.length; i++) {
            assertEquals(dataPrefix + internalPrefix + Integer.toString(i), keys[i]);
        }
    }

}