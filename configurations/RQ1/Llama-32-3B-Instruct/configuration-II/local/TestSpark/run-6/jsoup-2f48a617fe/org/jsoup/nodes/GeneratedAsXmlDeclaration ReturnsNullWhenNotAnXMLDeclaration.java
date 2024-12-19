package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.mockito.Mockito;

public class GeneratedAsXmlDeclaration ReturnsNullWhenNotAnXMLDeclaration {

    @Test
    public void asXmlDeclaration

    ReturnsNullWhenNotAnXMLDeclaration() {
        Comment comment = new Comment("This is a comment");
        assertNull(comment.asXmlDeclaration());
    }
}

class MockAppendable implements Appendable {
    @Override
    public Appendable append(CharSequence csx, int start, int end) throws IOException {
        return this;
    }

    @Override
    public Appendable append(CharSequence csq) {
        throw new UnsupportedOperationException();
    }
}

class MockDocumentOutputSettings implements Document.OutputSettings {
    private boolean prettyPrint;

    @Override
    public void setPrettyPrint(boolean prettyPrint) {
        this.prettyPrint = prettyPrint;
    }

    @Override
    public boolean isPrettyPrint() {
        return prettyPrint;
    }

    @Override
    public boolean outline() {
        return true;
    }
}

class MockDocument {
    private List<Element> children;

    @Override
    public List<Element> children() {
        return children;
    }

    public void addChild(Element element) {
        if (children == null) {
            children = new ArrayList<>();
        }
        children.add(element);
    }
}

class MockElement implements Element {
    private String tagName;

    public String tagName() {
        return tagName;
    }

    @Override
    public String tag() {
        return tagName;
    }

    @Override
    public void setAttribute(String name, String value) {
        // ignore attribute setting
    }

    @Override
    public String getAttribute(String name) {
        throw new UnsupportedOperationException();
    }
}

class MockParser extends Parser {
    private ParseSettings settings;

    public MockParser(ParseSettings settings) {
        this.settings = settings;
    }

    @Override
    public void settings(ParseSettings settings) {
        // ignore settings
    }

    @Override
    public String normalizeTag(String tag) {
        return tag;
    }

    @Override
    public NodeUtils parser(Document document) {
        return new NodeUtils(document, this.settings);
    }
}

class MockNodeUtils implements NodeUtils {
    private Document document;

    public MockNodeUtils(Document document, ParseSettings settings) {
        this.document = document;
    }

    @Override
    public Element parseElement(String tag) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String normalizeTag(Element element) {
        return "";
    }

}