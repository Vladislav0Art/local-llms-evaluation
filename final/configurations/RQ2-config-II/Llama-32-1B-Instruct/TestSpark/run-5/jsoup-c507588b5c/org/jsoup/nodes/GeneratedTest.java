package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class GeneratedTest {

    @Test
    public void [MethodUnderTest][Scenario]

    TestTextNode_text() {
        TextNode node = new TextNode("Hello, World!");
        assertEquals("Hello, World!", node.text());
    }

    @Test
    public void [MethodUnderTest][Scenario]

    TestTextNode_text_blank() {
        TextNode node = new TextNode("");
        assertEquals("", node.text());
    }

    @Test
    public void [MethodUnderTest][Scenario]

    TestTextNode_splitText() {
        TextNode node = new TextNode("Hello, World!");
        assertTrue(node.splitText(0).text().isEmpty());
    }

    @Test
    public void [MethodUnderTest][Scenario]

    TestTextNode_outerHtmlHead() {
        // Arrange
        String text = "Hello, World!";
        Document document = createDocument();

        // Act
        Appendable accum = document.outerHtml();
        outerHtmlHead(accum, 0, document.OutputSettings());
        assertTrue(new String((char[]) accum.getChars()).contains("Hello, World!"));

        // Assert
        assertNotEquals("", (new String((char[]) accum.getChars())).trim());
    }

    @Test
    public void [MethodUnderTest][Scenario]

    TestTextNode_outerHtmlTail() {
        // Arrange
        String text = "Hello, World!";
        Document document = createDocument();

        // Act
        Appendable accum = document.outerHtml();
        outerHtmlTail(accum, 0, document.OutputSettings());
        assertTrue(new String((char[]) accum.getChars()).contains("World!"));

        // Assert
        assertNotEquals("", (new String((char[]) accum.getChars())).trim());
    }

    @Test
    public void [MethodUnderTest][Scenario]

    TestTextNode_getWholeText() {
        TextNode node = new TextNode("Hello, World!");
        assertEquals("Hello, World!", node.getText());
    }

    @Test
    public void [MethodUnderTest][Scenario]

    TestTextNode_isBlank() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
    }

    @Test
    public void [MethodUnderTest][Scenario]

    TestTextNode_clone() {
        // Arrange
        String text = "Hello, World!";
        Document document = createDocument();
        Appendable accum = document.outerHtml();

        // Act
        TextNode clonedNode = (TextNode) node.clone();
        assertEquals(text, clonedNode.getText());

        // Assert
        assertNotEquals("", (new String((char[]) accum.getChars())).trim());
    }

    @Test
    public void [MethodUnderTest][Scenario]

    TestTextNodenodeName() {
        TextNode node = new TextNode("Hello, World!");
        assertEquals("text", node.getNodeName());
    }

    private Document createDocument() {
        return new Document();
    }

}