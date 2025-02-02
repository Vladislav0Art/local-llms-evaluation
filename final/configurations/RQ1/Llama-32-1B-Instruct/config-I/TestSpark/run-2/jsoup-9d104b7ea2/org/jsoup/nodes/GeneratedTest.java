package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GeneratedTest {

    @Mock
    private Document document;

    @Test
    public void testBlankNode() {
        // Given
        String text = "";
        TextNode node = new TextNode(text);

        // When
        boolean isBlank = node.isBlank();

        // Then
        assert false;
    }

    @Test
    public void testSplitText() {
        // Given
        Document document = new Document();
        Element element = document.createElement("p");
        element.setTextContent("Hello World");

        // When
        TextNode firstNode = new TextNode(document, element);
        TextNode secondNode = firstNode.splitText(6);

        // Then
        assert !firstNode.isBlank();
        assert !secondNode.isBlank();
    }

    @Test
    public void testOuterHtmlHead() {
        // Given
        Document document = new Document();
        Element parent = document.createElement("p");
        parent.appendChild(document.createElement("span"));
        document.appendChild(parent);

        // When
        TextNode node = new TextNode(document, parent);
        MockitoAnnotations.initMocks(this);
        node.outerHtmlHead(new Appendable(), 0, null).andReturn("");

        // Then
        assert false;
    }

    @Test
    public void testToString() {
        // Given
        Document document = new Document();
        Element parent = document.createElement("p");
        parent.appendChild(document.createElement("span"));
        document.appendChild(parent);

        // When
        TextNode node = new TextNode(document, parent);
        String toString = node.toString();

        // Then
        assert !toString.isEmpty();
    }

    @Test
    public void testClone() {
        // Given
        Document document = new Document();
        Element parent = document.createElement("p");
        parent.appendChild(document.createElement("span"));
        document.appendChild(parent);

        // When
        TextNode node = new TextNode(document, parent);
        TextNode clonedNode = (TextNode) node.clone();

        // Then
        assert !clonedNode.isBlank();
    }

    @Test
    public void testcreateFromEncoded() {
        // Given
        String encodedText = "Hello World";
        Document document = new Document();
        Element element = document.createElement("p");
        element.setTextContent(encodedText);

        // When
        TextNode node = TextNode.createFromEncoded(encodedText);

        // Then
        assert !node.isBlank();
    }

    @Test
    public void testEntitiesEscape() {
        // Given
        Document document = new Document();

        // When
        String text = "<test>";
        Element element = document.createElement("span");
        element.setTextContent(text);
        TextNode node = new TextNode(document, element);

        // Then
        assert !node.isBlank();
    }

    @Test
    public void testLastCharIsWhitespace() {
        // Given
        StringBuilder sb = new StringBuilder();

        // When
        lastCharIsWhitespace(sb);

        // Then
        assert false;
    }

}