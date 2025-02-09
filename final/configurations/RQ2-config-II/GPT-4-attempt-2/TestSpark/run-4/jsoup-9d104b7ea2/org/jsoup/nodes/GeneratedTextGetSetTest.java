package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.*;

public class GeneratedTextGetSetTest {

    @Test
    public void textGetSetTest() {
        TextNode node = new TextNode("");
        node.text("Test Text");
        Assert.assertEquals("Test Text", node.text());
    }

}