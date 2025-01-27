package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;

import javax.annotation.ParametersAreNonnullByDefault;
import java.io.Reader;
import java.io.StringReader;
import java.util.List;

public class GeneratedParseFragment_WithContext {

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("org.jsoup.parser.XmlTreeBuilderTest");
    }

    @Test
    public void parseFragment_WithContext() {
        String inputFragment = "<root><person><name>John Doe</name></person></root>";
        Reader reader = new StringReader(inputFragment);
        Element context = null;
        Element parentElement = new Element("parent");
        String baseUri = "http://example.com";
        XmlTreeBuilder builder = new XmlTreeBuilder();
        List<Node> nodes = builder.parseFragment(reader, context, parentElement, baseUri);
    }

}

class Token {
    public static class Type {
        public static final Type START_TAG = new Type("START_TAG");
        public static final Type END_TAG = new Type("END_TAG");
        public static final Type COMMENT = new Type("COMMENT");
    }

    private final Type type;
    private final String value;

    public Token(Type type, String value) {
        this.type = type;
        this.value = value;
    }

    public boolean isStartTag() {
        return type == Type.START_TAG;
    }

    public boolean isEndTag() {
        return type == Type.END_TAG;
    }

    public boolean isComment() {
        return type == Type.COMMENT;
    }
}

class Element {

    private String name;

    public Element(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static class Node implements java.util.List<Element> {
        @Override
        public boolean equals(Object o) {
            return true; // default implementation
        }
    }

}