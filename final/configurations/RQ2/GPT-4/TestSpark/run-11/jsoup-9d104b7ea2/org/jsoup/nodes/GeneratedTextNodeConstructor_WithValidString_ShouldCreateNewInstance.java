package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedTextNodeConstructor_WithValidString_ShouldCreateNewInstance {

    @Test
    public void TextNodeConstructor_WithValidString_ShouldCreateNewInstance() {
        TextNode textNode = new TextNode("ValidText");
        Assert.assertNotNull(textNode);
    }

}