package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Arrays;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void OuterHtmlHeadTest() {
        Document document = new Document();
        Appendable appendable = new StringBuilder();

        TextNode textNode = new TextNode("   Hello World  ");
        Document.OutputSettings outputSettings = new Document.OutputSettings(true);

        try {
            textNode.outerHtmlHead(appendable, 0, outputSettings);
        } catch (IOException e) {
        }

        assertEquals("<span>Hello World</span>", appendable.toString());
    }

}