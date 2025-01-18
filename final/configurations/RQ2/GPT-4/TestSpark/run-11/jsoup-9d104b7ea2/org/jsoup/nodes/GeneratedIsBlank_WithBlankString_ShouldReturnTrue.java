package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedIsBlank_WithBlankString_ShouldReturnTrue {

    @Test
    public void isBlank_WithBlankString_ShouldReturnTrue() {
        TextNode textNode = new TextNode(" ");
        Assert.assertTrue(textNode.isBlank());
    }

}