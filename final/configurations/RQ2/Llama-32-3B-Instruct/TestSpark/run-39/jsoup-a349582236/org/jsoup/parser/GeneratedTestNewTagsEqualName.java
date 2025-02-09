package org.jsoup.parser;

public class GeneratedTestNewTagsEqualName {

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
    public void testNewTagsEqualName() {
        Tag tag1 = new Tag("tag1");
        Tag tag2 = new Tag("tag1");
        assertEquals(tag1.getName(), tag2.getName());
    }

}