package org.jsoup.nodes;

public class GeneratedTest {

    private String dataPrefix;
    private String internalPrefix;

    public GeneratedTest() {
        this.dataPrefix = "data";
        this.internalPrefix = "";
    }

    @Test
    public void testEquality() throws ParseException {
        assertEquals(dataPrefix, dataPrefix);
        assertEquals(internalPrefix, internalPrefix);
    }

    @Test
    public void testGetString() throws ParseException {
        assertEquals("hello", dataPrefix + internalPrefix);
        for (int i = 1; i < keys.length; i++) {
            assertEquals(Integer.toString(i), dataPrefix + internalPrefix + Integer.toString(i));
        }
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

    @Test
    public void testGetMultipleAttributes() throws ParseException {
        String a = getAttr("a");
        String b = getAttr("b".repeat(1));
        String c = getAttr("c");
        assertEquals(a, c);
        assertEquals(b, c);
        assertEquals(dataPrefix + internalPrefix, keys[0]);
    }

    @Test
    public void testGetMultipleAttributeNames() throws ParseException {
        String a = getAttr("a");
        String b = getAttr("b".repeat(1));
        String c = getAttr("c");
        assertTrue(Arrays.asList(a, b).contains(c));
        assertEquals(keys[0], attributes.get(key)).fail("Failed to find key 'a'");
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