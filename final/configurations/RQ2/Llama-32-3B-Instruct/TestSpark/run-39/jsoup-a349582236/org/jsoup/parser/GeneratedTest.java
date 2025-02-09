package org.jsoup.parser;

public class GeneratedTest {

    private String name;

    public Tag(String name) {
        this.name = name;
    }

    public boolean isSelfClosing() {
        return false;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class GeneratedTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testNewTagSelfClosing() {
        Tag tag = new Tag("tag1");
        assertTrue(tag.isSelfClosing());
    }

    @Test
    public void testOriginalTagSelfClosing() {
        Tag originalTag = new Tag("originalTag");
        boolean selfClosing = originalTag.isSelfClosing();
        assertTrue(selfClosing);
    }

    @Test
    public void testNewTagsEqualName() {
        Tag tag1 = new Tag("tag1");
        Tag tag2 = new Tag("tag1");
        assertEquals(tag1.getName(), tag2.getName());
    }

    @Test
    public void testNewTagsDifferentName() {
        Tag tag1 = new Tag("tag1");
        Tag tag2 = new Tag("tag2");
        assertNotEquals(tag1.getName(), tag2.getName());
    }

    @Test
    public void testSetName() {
        Tag tag = new Tag("tag1");
        tag.setName("newTag");
        assertEquals("newTag", tag.getName());
    }

    @Test
    public void testSelfClosing() {
        Tag tag = new Tag("selfClosingTag");
        boolean selfClosing = tag.isSelfClosing();
        assertFalse(selfClosing);
    }

}