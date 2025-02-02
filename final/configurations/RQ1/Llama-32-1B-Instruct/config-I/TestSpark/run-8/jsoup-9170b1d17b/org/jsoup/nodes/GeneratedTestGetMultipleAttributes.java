package org.jsoup.nodes;

public class GeneratedTestGetMultipleAttributes {

    private String dataPrefix;
    private String internalPrefix;

    public GeneratedTest() {
        this.dataPrefix = "data";
        this.internalPrefix = "";
    }

    @Test
    public void testGetMultipleAttributes() throws ParseException {
        String a = getAttr("a");
        String b = getAttr("b".repeat(1));
        String c = getAttr("c");
        assertEquals(a, c);
        assertEquals(b, c);
        assertEquals(dataPrefix + internalPrefix, keys[0]);
    }

}