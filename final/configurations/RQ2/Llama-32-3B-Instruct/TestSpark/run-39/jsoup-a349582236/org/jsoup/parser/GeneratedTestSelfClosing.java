package org.jsoup.parser;

public class GeneratedTestSelfClosing {

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
    public void testSelfClosing() {
        Tag tag = new Tag("selfClosingTag");
        boolean selfClosing = tag.isSelfClosing();
        assertFalse(selfClosing);
    }

}