package org.jsoup.nodes;

import org.jsoup.helper.AttributeChangeListener;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.Assert;

import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedForEachTest {

    @Test
    public void forEachTest() {
        Element element = new Element("div");
        element.attr("id", "1");
        element.forEach(e -> e.attr("id", "2"));
        assertTrue(element.attr("id").equals("2"));
    }

}