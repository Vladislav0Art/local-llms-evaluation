package org.jsoup.parser;

public class GeneratedTestNameGetTest {

    private String name;

    public TagClass(String name) {
        if (name == null) {
            throw new NullPointerException("Name cannot be null");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static String normalName(String tagName) {
        return Normalizer.nfc(tagName).toString();
    }
}

public class GeneratedTest {

    @Test
    public void testNameGetTest() {
        TagClass tag = new TagClass("Tag");
        assertEquals("Tag", tag.getName());
    }

}