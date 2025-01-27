package org.jsoup.parser;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTestParseFragment {

    @Test
    public void testParseFragment() {
        // Arrange
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        String fragment = "<root><child/></root>";
        when(xmlTreeBuilder.parseFragment(any(String.class), any(Element.class), any(String.class), any(Parser.class))).thenReturn(null);

        // Act & Assert
        assertEquals(null, xmlTreeBuilder.parseFragment(fragment));
    }

}