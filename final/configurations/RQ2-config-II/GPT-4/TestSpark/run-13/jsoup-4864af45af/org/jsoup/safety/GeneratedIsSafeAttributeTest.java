package org.jsoup.safety;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsSafeAttributeTest {

    @Test
    public void isSafeAttributeTest() {
        Safelist safelist = new Safelist();
        safelist.addAttributes("a", "href");
        Element el = new Element("a");
        el.appendChild(new TextNode("test"));
        boolean result = safelist.isSafeAttribute("a", el, el.attributes().get(0));
        Assert.assertTrue(result);
    }

}