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

public class GeneratedBaseUriTest {

    @Test
    public void baseUriTest() {
        Element element = new Element("div");
        element.setBaseUri("http://base.uri");
        assertEquals("http://base.uri", element.baseUri());
    }

}