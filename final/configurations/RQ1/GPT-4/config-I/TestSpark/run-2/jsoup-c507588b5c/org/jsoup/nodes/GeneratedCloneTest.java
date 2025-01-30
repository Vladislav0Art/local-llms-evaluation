package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode tn = new TextNode("CloneText");
        TextNode clone = tn.clone();
        Assert.assertNotSame(tn, clone);
        Assert.assertEquals(tn.getWholeText(), clone.getWholeText());
    }

}