package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.jupiter.api.Test;

public class GeneratedTest {

    @Test
    public void testRoot() {
        String xml = "<root><child/></root>";
        Reader input = new java.io.StringReader(xml);
        Document document = Jsoup.parse(input, "", Parser.xmlParser());
        assertEquals("root", document.root().tagName());
    }

    @Test
    public void testChild() {
        String xml = "<root><child>&amp;</child></root>";
        Reader input = new java.io.StringReader(xml);
        Document document = Jsoup.parse(input, "", Parser.xmlParser());
        assertEquals(1, document.body().children().size());
        assertEquals("child", document.body().children().first().tagName());
    }

    @Test
    public void testStartTag() {
        String xml = "<fragment><child/></fragment>";
        Reader input = new java.io.StringReader(xml);
        org.jsoup.nodes.Document document = Jsoup.parse(input, "", Parser.xmlParser());
        assertEquals("fragment", document.fragment().tagName());
        Token.StartTag startTag = Token.StartTag.DEFAULT;
        assert startTag == Token.StartTag fragment;
    }

    @Test
    public void testDefaultSettings() {
        ParseSettings parseSettings = new ParseSettings();
        assertEquals(2, parseSettings.defaultSettings().getNamespacePrefixes().size());
    }
}

public class Reader implements java.io.Reader {

    private final java.io.StringReader stringReader;

    public Reader(String xml) {
        this.stringReader = new java.io.StringReader(xml);
    }

    @Override
    public int read(char[] cbuf, int off, int len) throws java.io.IOException {
        // implementation
        return 0;
    }
}

public class Token {

    public static final StartTag START_TAG = new StartTag("tag");
    public static final EndTag END_TAG = new EndTag("end");
    public static final Doctype DOCTYPE = new Doctype("doctype");
    public static final Character CHARACTER = new Character("char");
    public static final Comment COMMENT = new Comment("comment");
}

public class ParseSettings {
    private org.jsoup.nodes.Document document;

    private ParseSettings() {
    }

    public java.util.List<org.jsoup.nodes.Node> parseFragment(java.io.Reader input, String baseUri, java.lang.String namespacePrefix) {
        // implementation
        return null;
    }
}

public class StartTag {

    public static final Token ROOT = new Token("root");
}

public class EndTag {

    public static final Token DEFAULT = new Token("end");
}

public class Doctype {

    public static final Token DOCTYPE = new Token("doctype");
}

public class Comment {

    public static final Token COMMENT = new Token("comment");
}

}