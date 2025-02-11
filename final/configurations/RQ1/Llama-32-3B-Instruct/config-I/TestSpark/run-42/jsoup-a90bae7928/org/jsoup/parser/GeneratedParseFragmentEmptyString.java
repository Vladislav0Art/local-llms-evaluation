package org.jsoup.parser;

public class GeneratedParseFragmentEmptyString {

    private static final String XML_STRING = "<root><child>text</child></root>";
    private static final String EMPTY_STRING = "";
    private static final String DOCTYPE_STRING = "<!DOCTYPE root SYSTEM \"path/to/doctype\">";

    @Test
    public void parseFragmentEmptyString() {
        StringReader reader = new StringReader(EMPTY_STRING);
        XmlTreeBuilder builder = new XmlTreeBuilder();
        List<Node> result = builder.parseFragment(reader.toString(), "", new Parser());
        assertEquals(0, result.size());
    }
}

class Parser {
}

}