package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.junit.Assert;

import java.util.Arrays;
import java.util.List;

public class GeneratedSelectTest {

    @Test
    public void selectTest() {
        Element element = new Element("div");
        element.appendChild(new Element("p"));
        element.appendChild(new Element("span"));
        Elements selected = element.select("p");
        Assert.assertEquals(1, selected.size());
    }

}