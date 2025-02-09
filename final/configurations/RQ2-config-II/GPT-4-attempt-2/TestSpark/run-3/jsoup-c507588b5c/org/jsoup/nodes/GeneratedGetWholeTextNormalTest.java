package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

import java.io.IOException;

public class GeneratedGetWholeTextNormalTest {

    @Test
    public void getWholeTextNormalTest() {
        TextNode tNode = new TextNode("Whole text test");
        Assert.assertEquals("Whole text test", tNode.getWholeText());
    }

}