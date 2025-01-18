package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GeneratedHasAttributesFalseTest {

    @Test
    public void hasAttributesFalseTest() {
        Element el = new Element("test");
        Assert.assertFalse(el.hasAttributes());
    }

}