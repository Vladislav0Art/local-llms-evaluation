package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedText_SetNewText_ShouldReturnTextNodeWithNewText {

    @Test
    public void text_SetNewText_ShouldReturnTextNodeWithNewText() {
        TextNode textNode = new TextNode("OldText");
        Assert.assertEquals("NewText", textNode.text("NewText").text());
    }

}