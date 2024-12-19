package org.jsoup.nodes;

public class GeneratedTestPutNullString {

    @Test
    public void testPutNullString() {
        Attributes attributes = new Attributes();
        assertNotNull(attributes.put(null, "Value"));
        assertNotNull(attributes.put("", "Value"));
        assertNotNull(attributes.put(false, "Value"));
    }

}