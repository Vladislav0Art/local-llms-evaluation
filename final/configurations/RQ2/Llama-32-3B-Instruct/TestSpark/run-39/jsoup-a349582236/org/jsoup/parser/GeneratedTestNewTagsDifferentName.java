package org.jsoup.parser;

public class GeneratedTestNewTagsDifferentName {

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
    public void testNewTagsDifferentName() {
        Tag tag1 = new Tag("tag1");
        Tag tag2 = new Tag("tag2");
        assertNotEquals(tag1.getName(), tag2.getName());
    }

}