package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedNodeName_ValidText_ShouldReturnTextNode {

    @Test
    public void nodeName_ValidText_ShouldReturnTextNode() {
        TextNode textNode = new TextNode("#text");
        Assert.assertEquals("#text", textNode.nodeName());
    }

}