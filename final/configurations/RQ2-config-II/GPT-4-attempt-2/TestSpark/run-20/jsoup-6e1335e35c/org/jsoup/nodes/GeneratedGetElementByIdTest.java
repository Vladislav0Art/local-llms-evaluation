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

public class GeneratedGetElementByIdTest {

    @Test
    public void getElementByIdTest() {
        Element parent = new Element("div");
        Element child = parent.appendElement("p");
        child.attr("id", "someId");
        assertEquals("p", parent.getElementById("someId").tagName());
    }

}