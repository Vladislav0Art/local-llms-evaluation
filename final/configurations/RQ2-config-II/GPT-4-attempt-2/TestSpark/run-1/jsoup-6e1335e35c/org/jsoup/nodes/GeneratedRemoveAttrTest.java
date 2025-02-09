package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedRemoveAttrTest {

    @Test
    public void removeAttrTest() {
        Element element = new Element("tag");
        element.attr("key", "value");
        element.removeAttr("key");
        Assert.assertFalse(element.hasAttributes());
    }

}