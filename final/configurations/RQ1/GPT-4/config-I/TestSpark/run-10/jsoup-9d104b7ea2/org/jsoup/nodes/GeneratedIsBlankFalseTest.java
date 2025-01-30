package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsBlankFalseTest {

    @Test
    public void isBlankFalseTest() {
        TextNode textNode = new TextNode("Test Node");
        Assert.assertEquals(false, textNode.isBlank());
    }

}