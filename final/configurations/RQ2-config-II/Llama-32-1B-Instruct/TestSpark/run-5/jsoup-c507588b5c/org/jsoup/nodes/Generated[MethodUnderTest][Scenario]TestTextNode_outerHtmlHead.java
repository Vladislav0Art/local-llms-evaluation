package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class Generated[MethodUnderTest][Scenario]

TestTextNode_outerHtmlHead {

    @Test
    public void [MethodUnderTest][Scenario]TestTextNode_outerHtmlHead() {
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

}