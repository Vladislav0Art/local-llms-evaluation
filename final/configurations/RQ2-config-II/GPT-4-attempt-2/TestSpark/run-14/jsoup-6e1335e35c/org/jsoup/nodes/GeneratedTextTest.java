package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        Element el = new Element("p");
        el.text("Hello, World!");
        Assert.assertEquals("<p>Hello, World!</p>", el.toString());
    }

}