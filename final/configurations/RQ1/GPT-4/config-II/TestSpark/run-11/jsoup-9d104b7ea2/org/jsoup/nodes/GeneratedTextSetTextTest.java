package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Element;

import java.io.IOException;

import static org.mockito.Mockito.*;

public class GeneratedTextSetTextTest {

    @Test
    public void textSetTextTest() {
        String text = "Test Text";
        TextNode textNode = new TextNode(text);
        String newText = "New Test Text";
        textNode.text(newText);
        Assert.assertNotEquals(text, textNode.text());
        Assert.assertEquals(newText, textNode.text());
    }

}