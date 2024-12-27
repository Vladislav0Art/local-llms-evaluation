package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Tag;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.DataNode;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.jsoup.nodes.NodeVisitor;
import org.jsoup.nodes.NodeFilter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.io.Appendable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

import org.jsoup.helper.Consumer;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEnsureChildNodesTest_EmptyElementTest {

    @Test
    public void ensureChildNodesTest_EmptyElementTest() {
        Element element = new Element(Tag.valueOf("div"));
        List<Node> childNodes = element.ensureChildNodes();
        assertTrue(childNodes.isEmpty());
    }

}