package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class Generated[MethodUnderTest][Scenario]

TestTextNode_clone {

    @Test
    public void [MethodUnderTest][Scenario]TestTextNode_clone() {
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

}