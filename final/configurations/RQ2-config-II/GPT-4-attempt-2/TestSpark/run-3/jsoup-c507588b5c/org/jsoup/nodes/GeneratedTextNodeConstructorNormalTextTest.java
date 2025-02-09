package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

import java.io.IOException;

public class GeneratedTextNodeConstructorNormalTextTest {

    @Test
    public void textNodeConstructorNormalTextTest() {
        TextNode tNode = new TextNode("Testing");
        Assert.assertEquals("Testing", tNode.text());
    }

}