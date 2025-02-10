package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;

public class GeneratedTestOuterHtmlTail {

    @Test
    public void testOuterHtmlTail() {
        TextNode node = new TextNode("   Hello  World!");
        String[] expected = {"Hello, World!", "", ""};
        String actual = ((Document) node.parentNode).outerHtml();
        for (String s : expected) {
            Assert.assertTrue(actual.contains(s));
        }
    }

}