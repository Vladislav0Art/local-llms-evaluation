package org.jsoup.parser;

public class GeneratedTestNormalNameSingleCharacterReturnSingleCharacterTest {

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
    public void testNormalNameSingleCharacterReturnSingleCharacterTest() {
        TagClass tag = new TagClass("a");
        char[] expected = new char[1];
        expected[0] = 'a';
        String normalName = TagClass.normalName(tag.getName());
        assertTrue(normalName.length() == 1);
        assertEquals(expected, normalName.toCharArray());
    }

}