package org.jsoup.parser;

public class GeneratedTest {

    public void testEqualsAndHashCode() throws Mockito.NoMoreTestsException {
        Tag tag = new Tag();

        assertEquals("Tag{...", tag.toString());
        assertEquals(0, tag.hashCode());

        MockitoAnnotations.initMocks(this);
        TagParser parser = new TagParser(tag);

        Mockito.when(parser.new ParseSettings()).thenReturn(DEFAULT_SETTINGS);
        TagParser tagMock = new TagParser();
        Mockito.when(tagMock.new ParseSettings()).thenReturn(DEFAULT_SETTINGS);

        Mockito.verify(tagMock).new ParseSettings();  // test method
    }
}

public class TestParseSettings {
    public void testEqualsAndHashCode() throws Mockito.NoMoreTestsException {
        ParseSettings settings1 = new ParseSettings(true, true);
        ParseSettings settings2 = new ParseSettings(true, false);

        assertEquals("parseSettings", "parseSettings");
        assertEquals(0, 1); // actual and formal argument lists differ in length
    }
}

public class TestTagParser {

    @Test
    public void testEqualsAndHashCode() throws Mockito.NoMoreTestsException {
        TagParser parser = new TagParser(new Tag());

        assertEquals("Tag{...", parser.toString());
        assertEquals(10, 1); // actual and formal argument lists differ in length
    }

}