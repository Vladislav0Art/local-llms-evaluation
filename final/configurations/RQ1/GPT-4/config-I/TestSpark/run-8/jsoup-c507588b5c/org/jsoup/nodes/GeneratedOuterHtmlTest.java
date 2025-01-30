package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

public class GeneratedOuterHtmlTest {

    @Test
    public void outerHtmlTest() throws Exception {
        TextNode node = new TextNode("some text");
        Assert.assertThat(node.outerHtml(), is("some text"));
    }

}