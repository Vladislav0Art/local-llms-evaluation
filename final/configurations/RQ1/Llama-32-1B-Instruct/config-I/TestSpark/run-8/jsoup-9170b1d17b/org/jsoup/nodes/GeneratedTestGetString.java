package org.jsoup.nodes;

public class GeneratedTestGetString {

    private String dataPrefix;
    private String internalPrefix;

    public GeneratedTest() {
        this.dataPrefix = "data";
        this.internalPrefix = "";
    }

    @Test
    public void testGetString() throws ParseException {
        assertEquals("hello", dataPrefix + internalPrefix);
        for (int i = 1; i < keys.length; i++) {
            assertEquals(Integer.toString(i), dataPrefix + internalPrefix + Integer.toString(i));
        }
    }

}