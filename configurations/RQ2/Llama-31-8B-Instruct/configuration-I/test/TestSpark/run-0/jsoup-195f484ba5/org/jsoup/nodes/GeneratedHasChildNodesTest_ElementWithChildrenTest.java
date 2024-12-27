package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Tag;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.DataNode;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.io.Appendable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.jsoup.nodes.NodeVisitor;
import org.jsoup.nodes.NodeFilter;
import org.jsoup.helper.Consumer;

public class GeneratedHasChildNodesTest_ElementWithChildrenTest {

    @Test
    public void hasChildNodesTest_ElementWithChildrenTest() {
        Element element = new Element(Tag.valueOf("div"));
        element.appendChild(new TextNode("text"));
        assertTrue(element.hasChildNodes());
    }

}