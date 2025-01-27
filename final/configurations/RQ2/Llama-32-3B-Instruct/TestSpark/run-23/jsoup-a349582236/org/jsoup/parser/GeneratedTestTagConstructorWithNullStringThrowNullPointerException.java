package org.jsoup.parser;

public class GeneratedTestTagConstructorWithNullStringThrowNullPointerException {

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
    public void testTagConstructorWithNullStringThrowNullPointerException() {
        assertThrows(NullPointerException.class, () -> new TagClass(null));
    }

}