package org.jsoup.nodes;

import org.jsoup.helper.AttributeChangeListener;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.Assert;

import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedElementsByAttributeTest {

    @Test
    public void elementsByAttributeTest() {
        Element element = new Element("div");
        element.attr("id", "1");
        Elements result = element.getElementsByAttribute("id");
        assertNotNull(result);
        assertTrue(result.size() == 1);
        assertTrue(result.get(0) == element);
    }

}