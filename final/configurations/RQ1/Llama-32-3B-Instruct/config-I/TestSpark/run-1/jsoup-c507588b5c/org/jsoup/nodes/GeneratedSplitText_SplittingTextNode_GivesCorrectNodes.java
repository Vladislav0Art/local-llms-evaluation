package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedSplitText_SplittingTextNode_GivesCorrectNodes {

    @Test
    public void splitText_SplittingTextNode_GivesCorrectNodes() throws IOException {
        String encodedText = "&lt;Hello&gt; &amp; World";
        Document document = new Document(encodedText);
        TextNode textNode = (TextNode) document.body().children().get(0);
        TextNode node1 = (TextNode) textNode.splitText(8);
        TextNode node2 = (TextNode) textNode.splitText(textNode.text().length());
        assert (node1.text().equals("&lt;Hello&gt; "));
        assert (node2.text().equals("&amp; "));
    }

}