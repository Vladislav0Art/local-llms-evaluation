package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTextGetterTest {

    @Test
    public void textGetterTest() {
        String expected = "TestText";
        String value = " TestText    ";
        TextNode tn = new TextNode(value);
        Assert.assertEquals(expected, tn.text());
    }

}