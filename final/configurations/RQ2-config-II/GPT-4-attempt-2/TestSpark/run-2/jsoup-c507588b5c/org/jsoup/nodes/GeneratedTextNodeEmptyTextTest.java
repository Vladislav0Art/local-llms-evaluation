package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

public class GeneratedTextNodeEmptyTextTest {

    @Test
    public void TextNodeEmptyTextTest() {
        TextNode node = new TextNode("");
        Assert.assertThat(node.text(), is(""));
    }

}