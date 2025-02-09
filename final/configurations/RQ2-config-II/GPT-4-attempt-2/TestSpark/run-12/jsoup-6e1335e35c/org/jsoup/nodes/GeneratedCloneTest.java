package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.util.List;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Element element = new Element("div");
        Element cloneElement = element.clone();
        assertEquals(element.tagName(), cloneElement.tagName());
    }

}