package org.jsoup.nodes;

public class GeneratedTestParseException {

    private String dataPrefix;
    private String internalPrefix;

    public GeneratedTest() {
        this.dataPrefix = "data";
        this.internalPrefix = "";
    }

    @Test
    public void testParseException() throws ParseException {
        try {
            getAttr("b".repeat(1));
            fail("Expected ParseException");
        } catch (ParseException e) {
            // Expected
        }
    }

    private String dataPrefix;
    private String internalPrefix;

    private String getAttr(String key) throws ParseException {
        if (!dataPrefix.equals(key)) return null; // Return attribute from other string.
        return keys[0];
    }

}