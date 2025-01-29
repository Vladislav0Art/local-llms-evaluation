package org.jsoup.nodes;

public class GeneratedTestCheckNotNull_EmptyString_ThrowsException {

    private Attributes attributes;

    @Test
    public void testCheckNotNull_EmptyString_ThrowsException() {
        assertThrows(StringNullChecker.class, () -> attributes.checkNotNull(""));
    }

}