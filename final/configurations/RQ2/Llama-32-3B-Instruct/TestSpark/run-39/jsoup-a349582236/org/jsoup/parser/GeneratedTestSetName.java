package org.jsoup.parser;

public class GeneratedTestSetName {

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
    public void testSetName() {
        Tag tag = new Tag("tag1");
        tag.setName("newTag");
        assertEquals("newTag", tag.getName());
    }

}