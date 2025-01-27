package org.jsoup.parser;

public class GeneratedTestNormalName {

    @Mock
    private ParseSettings settings;

    @Test
    public void testNormalName() {
        String tagName = "tag!";
        Tag tag = new Tag(tagName);
        assertEquals(Normalizer.nfc(tagName), tag.normalName());
    }

}