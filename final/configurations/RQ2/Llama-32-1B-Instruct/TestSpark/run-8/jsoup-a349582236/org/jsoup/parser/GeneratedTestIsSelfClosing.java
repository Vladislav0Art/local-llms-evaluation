package org.jsoup.parser;

public class GeneratedTestIsSelfClosing {

    @Test
    public void testIsSelfClosing() {
        Tag tag = new Tag();
        boolean expected = false;
        boolean actual = isSelfClosing();
        assertNotEquals(expected, actual);
        assertFalse(actual);
    }
}

}