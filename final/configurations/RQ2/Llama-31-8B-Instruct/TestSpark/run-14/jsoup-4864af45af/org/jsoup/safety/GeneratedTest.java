package org.jsoup.safety;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import org.jsoup.nodes.NodeType;

@RunWith(org.junit.runners.Parameterized.class)
public class GeneratedTest {

    @Parameters
    public static Iterable<Object[]> data() {
        return java.util.Arrays.asList(new Object[][]{
                {Safelist.none()},
                {Safelist.simpleText()},
                {Safelist.basic()},
                {Safelist.basicWithImages()},
                {Safelist.relaxed()}
        });
    }

    public static class TestContext {
        public Safelist safelist;
    }

}