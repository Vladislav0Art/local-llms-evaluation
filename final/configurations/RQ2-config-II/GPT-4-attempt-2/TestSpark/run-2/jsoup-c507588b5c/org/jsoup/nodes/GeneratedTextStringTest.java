package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

public class GeneratedTextStringTest {

    @Test
    public void textStringTest() {
        TextNode node = new TextNode("First");
        node.text("Second");
        Assert.assertThat(node.text(), is("Second"));
    }

}