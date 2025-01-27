package org.jsoup.parser;

public class GeneratedTest {

    private String value;
    private boolean isEndOfDocument;

    public Token(String value, boolean isEndOfDocument) {
        this.value = value;
        this.isEndOfDocument = isEndOfDocument;
    }

    public static Token createToken(String value, boolean isEndOfDocument) {
        return new Token(value, isEndOfDocument);
    }
}

public class Parser implements org.jsoup.parser.Parser {
    @Override
    public void parse(Reader reader) {
    }

    @Override
    public void error(String message) {
    }

    @Override
    public String toString() {
        return "";
    }

    @Override
    public void warning(String message) {
    }
}

public class XmlTreeBuilder extends org.jsoup.parser.XmlTreeBuilder implements Parser {
    @Override
    public void parse(Reader reader) {
    }

    @Override
    public void error(String message) {
    }

    @Override
    public String toString() {
        return "";
    }

    @Override
    public void warning(String message) {
    }

    public static XmlTreeBuilder createXmlTreeBuilder() {
        return new XmlTreeBuilder();
    }
}

public class GeneratedTest {

}