package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

public class GeneratedElementConstructorTest {

    @Test
    public void ElementConstructorTest() {
        Element el = new Element("div");
        Assert.assertEquals("<div></div>", el.toString());

        el = new Element(Tag.valueOf("p"), "http://example.com");
        Assert.assertEquals("<p></p>", el.toString());

        Attributes attr = new Attributes();
        attr.put("class", "btn");
        el = new Element(Tag.valueOf("a"), "http://example.com", attr);
        Assert.assertEquals("<a class=\"btn\"></a>", el.toString());
    }

}