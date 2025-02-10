package org.jsoup.parser;

public class GeneratedTestInsertElementValidStartTag {

    @Mock
    private Reader inputReader;

    @Mock
    private String baseUri;

    @Mock
    private Parser parser;

    @Mock
    private ParseSettings parseSettings;

    public void setup() {
    }

    @Test
    public void testInsertElementValidStartTag() {
        Element element = new Element("element");
        assertInsert(element);
    }

}