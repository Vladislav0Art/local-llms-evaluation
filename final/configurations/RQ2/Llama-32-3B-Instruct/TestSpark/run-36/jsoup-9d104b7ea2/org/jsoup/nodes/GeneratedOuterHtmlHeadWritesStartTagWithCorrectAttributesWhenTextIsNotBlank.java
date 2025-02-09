package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Text;
import org.junit.Test;

public class GeneratedOuterHtmlHeadWritesStartTagWithCorrectAttributesWhenTextIsNotBlank {

    @Test
    public void outerHtmlHeadWritesStartTagWithCorrectAttributesWhenTextIsNotBlank() throws IOException {
        Document document = Jsoup.parse("<head></head>");
        Node node = new LeafNode(document.body(0), null, null);
        when(node.text()).thenReturn("encoded text");
        String result = textNode.splitText(offset);
        assertEquals("", result);
    }

}