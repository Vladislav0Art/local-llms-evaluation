package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

import java.io.IOException;

public class GeneratedCloneNormalTest {

    @Test
    public void cloneNormalTest() {
        TextNode tNode = new TextNode("test");
        TextNode cloneNode = tNode.clone();
        Assert.assertNotSame(tNode, cloneNode);
        Assert.assertEquals(tNode.text(), cloneNode.text());
    }

}