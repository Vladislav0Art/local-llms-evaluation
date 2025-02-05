package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.*;

import java.util.Arrays;

public class GeneratedEmptyTest {

    @Test
    public void emptyTest() {
        Element element = new Element("div");
        Element child = new Element("p");
        element.appendChild(child);
        element.empty();
        Assert.assertTrue(element.childNodeSize() == 0);
    }

}