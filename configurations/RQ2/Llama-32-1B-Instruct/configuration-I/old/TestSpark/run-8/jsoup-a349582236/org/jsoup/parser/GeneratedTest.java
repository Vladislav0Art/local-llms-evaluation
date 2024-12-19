package org.jsoup.parser;

public class GeneratedTest {

    @Test
    public void testGetValueByTagName() {
        Tag value = new TagImpl("p", true);
        assertEquals(toString(), value.getValueByName("p"));
        assertEquals(new TagImpl("P", true), getValueByName("P"));
        assertFalse(getValueByName(null));
    }

    private String toString() {
        return "<" + name + ">";
    }

    @Test
    public void testGetValueByTagName_Unknown() {
        Tag value = new TagImpl("unknown", false);
        assertEquals("", value.getValueByName("unknown"));
        assertTrue(toString().equals(getValueByName("unknown")));
    }

    @Test
    public void testIsBlockTag() {
        assertFalse(new TagImpl().isBlock());
        assertTrue(TagImpl.class.isAssignableFrom(TagImpl.class));
    }

    @Test
    public void testFormatAsBlockTag() {
        assertFalse(new TagImpl().formatAsBlock());
        assertTrue(new TagImpl().formatAsBlock());
    }

    @Test
    public void testIsInlineTag() {
        assertFalse(new TagImpl().isInline());
        assertTrue(InlineTag.class.isAssignableFrom(TagImpl.class));
    }

    @Test
    public void testIsEmpty() {
        assertFalse(new TagImpl().isEmpty());
        assertTrue(new TagImpl("a").isEmpty());
    }

    @Test
    public void testIsSelfClosing() {
        assertFalse(new TagImpl().isSelfClosing());
        assertTrue(SelfClosingTag.class.isAssignableFrom(TagImpl.class));
    }

    @Test
    public void testIsKnownTag() {
        assertTrue(TagImpl.class.isAssignableFrom(TagImpl.class));
        assertTrue(knownTagValue.equals("P"));
    }

    @Test
    public void testIsFormSubmittable() {
        assertFalse(new TagImpl().isFormSubmittable());
        assertTrue(FormTag.class.isAssignableFrom(TagImpl.class));
    }

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

    @Test
    public void testGetValueByName() {
        Tag value = new TagImpl("p", false);
        assertEquals(value.toString(), getValueByName("p"));
        assertEquals(new TagImpl("P", false), getValueByName("P"));
        assertFalse(getValueByName(null));
    }

}