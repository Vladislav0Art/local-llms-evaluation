package org.jsoup.parser;

public class GeneratedTestOriginalTag {

    private String name;

    public Tag(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSelfClosing() {
        // implement logic to check if tag is self-closing
        return false;
    }
}

public class TestTag {

    @Test
    public void testOriginalTag() {
        Tag originalTag = new Tag("originalTag");
        Tag newTag = new Tag(originalTag.getName());
        assertEquals(originalTag.getName(), newTag.getName());
    }
}

}