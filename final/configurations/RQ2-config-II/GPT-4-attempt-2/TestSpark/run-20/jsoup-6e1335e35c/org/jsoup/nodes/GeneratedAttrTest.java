package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.jsoup.helper.Attributes;
import org.jsoup.select.Evaluator;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class GeneratedAttrTest {

    @Test
    public void attrTest() {
        Element element = new Element("div");
        element.attr("name", "value");
        assertEquals("value", element.attr("name"));
    }

}