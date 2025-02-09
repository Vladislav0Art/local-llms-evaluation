package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedNormaliseWhitespaceTest {

    @Test
    public void normaliseWhitespaceTest() {
        String result = TextNode.normaliseWhitespace("  Sample    Text  ");

        Assert.assertEquals(" Sample Text ", result);
    }

}