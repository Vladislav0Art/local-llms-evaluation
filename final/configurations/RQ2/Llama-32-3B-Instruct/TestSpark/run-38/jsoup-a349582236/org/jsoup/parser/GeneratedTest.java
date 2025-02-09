package org.jsoup.parser;

public class GeneratedTest {

    private String name;

    public Tag(String name) {
        setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class TestTag {

    @Test
    public void testTag() {
        Tag tag1 = new Tag("test");
        Tag tag2 = new Tag("tag2");

        System.out.println(tag1.getName());
        System.out.println(tag2.getName());

        // Create a new tag with name "another"
        Tag anotherTag = new Tag("another");

        System.out.println(anotherTag.getName());
    }

}