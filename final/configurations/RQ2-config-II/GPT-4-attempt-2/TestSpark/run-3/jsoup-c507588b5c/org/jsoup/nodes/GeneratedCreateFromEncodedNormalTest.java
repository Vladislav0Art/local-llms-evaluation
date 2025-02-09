package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

import java.io.IOException;

public class GeneratedCreateFromEncodedNormalTest {

    @Test
    public void createFromEncodedNormalTest() {
        TextNode tNode = TextNode.createFromEncoded("test", true);
        Assert.assertEquals("test", tNode.text());
    }

}