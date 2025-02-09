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

public class GeneratedGetElementsByTagTest {

    @Test
    public void getElementsByTagTest() {
        Element parent = new Element("div");
        parent.appendElement("p");
        parent.appendElement("span");
        assertEquals(1, parent.getElementsByTag("p").size());
    }

}