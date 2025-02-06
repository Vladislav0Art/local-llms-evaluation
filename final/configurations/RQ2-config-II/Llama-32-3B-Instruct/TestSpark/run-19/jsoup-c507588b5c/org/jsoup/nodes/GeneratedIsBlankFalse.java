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

public class GeneratedIsBlankFalse {

    @Test
    public void isBlankFalse() {
        TextNode textNode = new TextNode("text");
        assertFalse(textNode.isBlank());
    }

}