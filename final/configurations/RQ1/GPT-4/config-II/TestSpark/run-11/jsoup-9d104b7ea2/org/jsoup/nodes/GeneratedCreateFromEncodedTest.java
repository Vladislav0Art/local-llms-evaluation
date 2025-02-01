package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Element;

import java.io.IOException;

import static org.mockito.Mockito.*;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void createFromEncodedTest() {
        String encodedText = "&lt;Test&gt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        String expected = "<Test>";
        Assert.assertEquals(expected, textNode.getWholeText());
    }

}