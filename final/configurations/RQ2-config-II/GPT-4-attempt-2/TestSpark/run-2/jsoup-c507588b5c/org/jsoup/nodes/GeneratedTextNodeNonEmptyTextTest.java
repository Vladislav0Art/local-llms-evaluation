package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

public class GeneratedTextNodeNonEmptyTextTest {

    @Test
    public void TextNodeNonEmptyTextTest() {
        TextNode node = new TextNode("Test");
        Assert.assertThat(node.text(), is("Test"));
    }

}