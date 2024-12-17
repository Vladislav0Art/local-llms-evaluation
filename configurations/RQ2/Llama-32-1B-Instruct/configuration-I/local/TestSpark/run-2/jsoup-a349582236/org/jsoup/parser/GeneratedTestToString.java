package org.jsoup.parser;

public class GeneratedTestToString {

    private final String name;
    private final ParseSettings settings;

    public Tag(String name, ParseSettings settings) {
        this.name = name;
        this.settings = settings;
    }

    public static boolean equals(Tag t1, Tag t2) {
        return t1.getName().equals(t2.getName()) && t1.getSettings().equals(t2.getSettings());
    }

    @Override
    public String toString() {
        return "Tag{" +
                "name='" + name + '\'' +
                ", settings=" + settings +
                '}';
    }
}

public class TagParser {
    private final org.jsoup.parser.Parser parser;
    private static final Mockito mock = Mockito.mock(org.jsoup.parser.Parser.class);

    @Before
    public void setUp() {
        parseSettings();

        // Assuming ParseSettings is a custom class with necessary methods
        when(mock.getSettings()).thenReturn(parseSettings());
    }

    public Tag valueOf(String tagName, ParseSettings settings) {
        return (Tag) mock.invoke(parser.valueOf(tagName, settings));
    }

    public static Tag valueOf(String tagName) {
        return (Tag) mock.invoke(parser.valueOf(tagName));
    }
}

public class ParseSettings {
    // Custom implementation of ParseSettings
}

public class TagTest {

    @Test
    public void testToString() {
        TestTag tag = new Tag("test", ParseSettings.INSTANCE);

        Assert.assertEquals("Tag{name='test', settings=ParseSettings{...})", tag.toString());
    }
}

}