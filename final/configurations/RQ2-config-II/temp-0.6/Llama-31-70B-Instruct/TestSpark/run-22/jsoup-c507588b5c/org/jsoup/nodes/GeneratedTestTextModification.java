package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedTestTextModification {

    @Test
    public void testTextModification() {
        TextNode textNode = new TextNode("test");
        textNode.text("modified");
        Assert.assertEquals("modified", textNode.text());
    }

}