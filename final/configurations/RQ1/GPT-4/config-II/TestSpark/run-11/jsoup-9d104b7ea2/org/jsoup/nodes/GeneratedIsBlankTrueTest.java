package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Element;

import java.io.IOException;

import static org.mockito.Mockito.*;

public class GeneratedIsBlankTrueTest {

    @Test
    public void isBlankTrueTest() {
        TextNode textNode = new TextNode("   ");
        Assert.assertTrue(textNode.isBlank());
    }

}