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

public class GeneratedIsEvaluatorTest {

    @Test
    public void isEvaluatorTest() {
        Element root = new Element("div");
        Element child = new Element("span");
        root.appendChild(child);
        Evaluator evaluator = Evaluator.TagEndsWith("span");
        assertTrue(root.is(evaluator));
    }

}