package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.html5.OutputSettings;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedClone {

    @Test
    public void clone() {
        String originalText = "original text";
        TextNode textNodeBefore = new TextNode(originalText);
        TextNode textNodeAfter = new TextNode("after text");

        textNodeAfter.text(originalText);

        TextNode cloned = textNodeBefore.clone();

        assertEquals(originalText, cloned.text());
    }

}