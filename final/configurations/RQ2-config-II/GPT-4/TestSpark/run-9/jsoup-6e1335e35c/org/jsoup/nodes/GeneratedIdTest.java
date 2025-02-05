package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIdTest {

    @Test
    public void idTest() {
        String id = "myID";
        Element element = new Element("tag");
        element.id(id);
        Assert.assertEquals(id, element.id());
    }

}