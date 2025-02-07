package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class Generated[MethodUnderTest][Scenario]

TestTextNode_outerHtmlTail {

    @Test
    public void [MethodUnderTest][Scenario]TestTextNode_outerHtmlTail() {
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

}