package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

import java.io.IOException;

public class GeneratedNodeNameNormalTest {

    @Test
    public void nodeNameNormalTest() {
        TextNode tNode = new TextNode("");
        Assert.assertEquals("#text", tNode.nodeName());
    }

}