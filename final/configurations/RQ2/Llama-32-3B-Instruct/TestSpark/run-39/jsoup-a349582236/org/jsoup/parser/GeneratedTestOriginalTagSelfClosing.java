package org.jsoup.parser;

public class GeneratedTestOriginalTagSelfClosing {

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
    public void testOriginalTagSelfClosing() {
        Tag originalTag = new Tag("originalTag");
        boolean selfClosing = originalTag.isSelfClosing();
        assertTrue(selfClosing);
    }

}