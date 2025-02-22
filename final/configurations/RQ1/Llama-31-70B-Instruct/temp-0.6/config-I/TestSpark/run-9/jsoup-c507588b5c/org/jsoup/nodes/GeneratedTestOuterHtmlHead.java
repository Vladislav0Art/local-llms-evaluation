package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;

import static org.junit.Assert.assertEquals;

public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() {
        TextNode textNode = new TextNode("test");
        Appendable appendable = new StringBuilder();
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        outputSettings.prettyPrint(true);

        try {
            textNode.outerHtmlHead(appendable, 1, outputSettings);
        } catch (IOException e) {
            e.printStackTrace();
        }

        assertEquals(" test", appendable.toString());
    }

}