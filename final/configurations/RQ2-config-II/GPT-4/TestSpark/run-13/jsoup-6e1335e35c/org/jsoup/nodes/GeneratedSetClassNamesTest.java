package org.jsoup.nodes;

import org.jsoup.helper.AttributeChangeListener;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.Assert;

import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedSetClassNamesTest {

    @Test
    public void setClassNamesTest() {
        Element element = new Element("div");
        LinkedHashSet<String> set = new LinkedHashSet<String>();
        set.add("testClass");
        element.setClassNames(set);
        assertTrue(element.hasClass("testClass"));
    }

}