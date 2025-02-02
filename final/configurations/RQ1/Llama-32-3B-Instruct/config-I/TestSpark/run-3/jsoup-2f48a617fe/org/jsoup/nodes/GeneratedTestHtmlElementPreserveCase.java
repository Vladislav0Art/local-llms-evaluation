package org.jsoup.nodes;

public class GeneratedTestHtmlElementPreserveCase {

    @Test
    public void testHtmlElementPreserveCase() {
        Parser parser = new Parser();
        ParseSettings settings = new ParseSettings(true);
        Document document = parser.htmlParser().settings(settings).parseInput("<ELEMENT>", "baseUri()");
        assertEquals("ELEMENT", document.toString());
    }
}

public class Parser {

    public HtmlParser htmlParser() {
        return new HtmlParser();
    }

    public XmlParser xmlParser() {
        return new XmlParser();
    }

    public Document parseInput(String input, String baseUri) {
        return null;
    }
}

public class HtmlParser {

    public ParseSettings settings(ParseSettings settings) {
        return settings;
    }

    public Document parseInput(String input, String baseUri) {
        return null;
    }
}

public class XmlParser {

    public Document parseInput(String input) {
        return null;
    }
}

public class ParseSettings {

    public boolean preserveCase;

    public ParseSettings(boolean preserveCase) {
        this.preserveCase = preserveCase;
    }

    public ParseSettings() {
    }
}

public class Document {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Document document = (Document) o;
        return Objects.equals(name, document.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

public class XmlDeclaration {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}