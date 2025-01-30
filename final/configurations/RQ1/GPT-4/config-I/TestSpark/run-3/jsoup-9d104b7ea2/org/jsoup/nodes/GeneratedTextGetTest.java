package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document.OutputSettings;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedTextGetTest {

    @Test
    public void textGetTest() {
        TextNode textNode = new TextNode(" Sample Text ");
        Assert.assertEquals("Sample Text", textNode.text());
    }

}