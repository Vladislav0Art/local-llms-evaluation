package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.junit.Test;

public class GeneratedLastCharIsWhitespace_GivesFalseWhenLastCharacterIsNotWhitespace {

    @Test
    public void lastCharIsWhitespace_GivesFalseWhenLastCharacterIsNotWhitespace() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        boolean result = TextNode.lastCharIsWhitespace(sb);
        Assert.assertFalse(result);
    }

}