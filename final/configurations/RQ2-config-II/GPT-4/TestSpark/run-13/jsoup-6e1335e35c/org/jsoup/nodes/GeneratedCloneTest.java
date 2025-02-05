package org.jsoup.nodes;

import org.jsoup.helper.AttributeChangeListener;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.Assert;

import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Element element = new Element("div");
        element.attr("id", "1");
        Element cloned = element.clone();
        assertTrue(cloned != element);
        assertTrue(cloned.attr("id").equals("1"));
    }

}