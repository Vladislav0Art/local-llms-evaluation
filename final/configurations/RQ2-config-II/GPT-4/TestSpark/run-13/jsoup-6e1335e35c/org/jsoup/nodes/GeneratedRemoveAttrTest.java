package org.jsoup.nodes;

import org.jsoup.helper.AttributeChangeListener;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.Assert;

import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedRemoveAttrTest {

    @Test
    public void removeAttrTest() {
        Element element = new Element("div");
        element.attr("id", "testId");
        element.removeAttr("id");
        assertFalse(element.hasAttributes());
    }

}