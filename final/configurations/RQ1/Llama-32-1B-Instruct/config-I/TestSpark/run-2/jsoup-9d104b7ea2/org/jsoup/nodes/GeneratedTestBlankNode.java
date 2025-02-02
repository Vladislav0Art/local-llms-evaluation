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

public class GeneratedTestBlankNode {

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

}