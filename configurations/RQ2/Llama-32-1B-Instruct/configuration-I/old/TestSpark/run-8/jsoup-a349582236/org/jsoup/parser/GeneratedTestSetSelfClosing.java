package org.jsoup.parser;

public class GeneratedTestSetSelfClosing {

    @Test
    public void testSetSelfClosing() {
        new TagImpl("a", false).setSelfClosing();
        assertEquals(false, new TagImpl("a", false).isSelfClosing());
        assertTrue(knownFormTag.isSelfClosing());
    }

    private class FormTag extends TagImpl {
        public FormTag(String tagName) {
            super(tagName, true);
        }
    }

}