package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.*;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        TextNode node = new TestNode("Test Text");
        Assert.assertThat(node.toString(), containsString("Test Text"));
    }

}