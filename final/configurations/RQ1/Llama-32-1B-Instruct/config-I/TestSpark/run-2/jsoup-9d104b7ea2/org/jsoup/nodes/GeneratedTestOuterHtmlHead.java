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

public class GeneratedTestOuterHtmlHead {

    @Mock
    private Document document;

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

}