package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

import java.io.IOException;

public class GeneratedTextSetNormalTest {

    @Test
    public void textSetNormalTest() {
        TextNode tNode = new TextNode("");
        tNode.text("New Text");
        Assert.assertEquals("New Text", tNode.text());
    }

}