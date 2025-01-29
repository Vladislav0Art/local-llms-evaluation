package org.jsoup.parser;

public class GeneratedTestIsSelfClosing {

    @Before
    public void setup() {
    }

    @Test
    public void testIsSelfClosing() {
        Tag tag1 = new Tag();
        assertTrue(tag1.isSelfClosing());
        Tag tag2 = new Tag();
        assertFalse(tag2.isSelfClosing());
    }

}