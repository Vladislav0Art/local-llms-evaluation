package org.jsoup.parser;

public class GeneratedTest {

    @Test
    public void testGetName() {
        Tag tag = new Tag();
        assertEquals("p", tag.getName());
    }

    @Test
    public void testGetNormalName() {
        Tag tag = new Tag();
        assertEquals("p", tag.getNormalName());
    }

    @Test
    public void testValueOf_P() {
        assertEquals(valueOfP, Tag.valueOf("p"));
    }

    @Test
    public void testValueOf_Div() {
        assertEquals(valueOfDiv, Tag.valueOf("div"));
    }

    @Test
    public void testIsBlock() {
        Tag tag = new Tag();
        assertTrue(tag.isBlock());
    }

    @Test
    public void testFormatAsBlock() {
        Tag tag = new Tag();
        assertFalse(tag.formatAsBlock());
    }

    @Test
    public void testIsInline() {
        Tag tag = new Tag();
        assertFalse(tag.isInline());
    }

    @Test
    public void testIsEmpty() {
        Tag tag = new Tag();
        assertTrue(tag.isEmpty());
    }

    @Test
    public void testSelfClosing() {
        Tag tag = new TagImpl();
        assertEquals(false, tag.setSelfClosing());
    }

    @Test
    public void testEquals_P() {
        Tag tag1 = new TagImpl("p");
        Tag tag2 = new TagImpl("P");
        assertTrue(tag1.equals(tag2));
    }

    @Test
    public void testHashCode_P() {
        Tag tag1 = new TagImpl("p");
        Tag tag2 = new TagImpl("P");
        assertEquals(0, tag1.hashCode());
        assertEquals(0, tag2.hashCode());
    }

}