package org.jsoup.nodes;

public class GeneratedTestGetMultipleAttributeNames {

    private String dataPrefix;
    private String internalPrefix;

    public GeneratedTest() {
        this.dataPrefix = "data";
        this.internalPrefix = "";
    }

    @Test
    public void testGetMultipleAttributeNames() throws ParseException {
        String a = getAttr("a");
        String b = getAttr("b".repeat(1));
        String c = getAttr("c");
        assertTrue(Arrays.asList(a, b).contains(c));
        assertEquals(keys[0], attributes.get(key)).fail("Failed to find key 'a'");
    }

}