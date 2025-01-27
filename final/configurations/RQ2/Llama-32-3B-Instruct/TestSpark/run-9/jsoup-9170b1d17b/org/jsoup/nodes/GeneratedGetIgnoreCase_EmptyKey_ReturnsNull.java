package org.jsoup.nodes;

public class GeneratedGetIgnoreCase_EmptyKey_ReturnsNull {

    @Test
    public void getIgnoreCase_EmptyKey_ReturnsNull() {
        Attributes attributes = new Attributes();
        assertNull(attributes.getIgnoreCase(""));
    }

}