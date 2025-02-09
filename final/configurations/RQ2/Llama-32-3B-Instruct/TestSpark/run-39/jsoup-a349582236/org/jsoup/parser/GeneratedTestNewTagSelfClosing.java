package org.jsoup.parser;

public class GeneratedTestNewTagSelfClosing {

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

}