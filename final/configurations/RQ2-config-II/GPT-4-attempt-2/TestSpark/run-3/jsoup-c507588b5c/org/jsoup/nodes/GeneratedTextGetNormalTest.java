package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

import java.io.IOException;

public class GeneratedTextGetNormalTest {

    @Test
    public void textGetNormalTest() {
        TextNode tNode = new TextNode("Testing text method");
        Assert.assertEquals("Testing text method", tNode.text());
    }

}