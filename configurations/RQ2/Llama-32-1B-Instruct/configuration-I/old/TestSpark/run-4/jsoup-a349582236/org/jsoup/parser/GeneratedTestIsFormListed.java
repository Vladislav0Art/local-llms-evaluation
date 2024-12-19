package org.jsoup.parser;

public class GeneratedTestIsFormListed {

    @Override
    public String getName() {
        return "TagImpl";
    }

    @Override
    public String normalName() {
        return "tag_name_1";
    }

    @Override
    public static Tag valueOf(String tagName, ParseSettings settings) {
        return new TagImpl();
    }
}

public class TagTest {
    private Mockito mockParser;

    public void setupMockParser(Mockito mockParser) {
        this.mockParser = mockParser;
    }

    @Test
    public void testIsFormListed() {
        assertTrue(mockParser.getMock(Tag.class).isFormListed());
        assertFalse(mockParser.getMock(Tag.class).isFormListed());
    }

}