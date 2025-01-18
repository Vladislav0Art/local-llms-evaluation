package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedIsBlank_WithNonBlankString_ShouldReturnFalse {

    @Test
    public void isBlank_WithNonBlankString_ShouldReturnFalse() {
        TextNode textNode = new TextNode("NonBlank");
        Assert.assertFalse(textNode.isBlank());
    }

}