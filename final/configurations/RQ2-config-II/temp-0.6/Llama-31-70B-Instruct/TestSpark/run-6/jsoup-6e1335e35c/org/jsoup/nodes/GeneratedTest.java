package org.jsoup.nodes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.jsoup.helper.ChangeNotifyingArrayList;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Tag;
import org.jsoup.parser.ParseSettings;
import org.jsoup.select.Evaluator;
import org.jsoup.select.NodeFilter;
import org.jsoup.select.NodeVisitor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedTest {

    Element element;

    @Mock
    Tag mockTag;
    @Mock
    ChangeNotifyingArrayList mockChangeNotifyingArrayList;
    @Mock
    Attributes mockAttributes;
    @Mock
    Node mockNode;
    @Mock
    Document mockDocument;
    @Mock
    ParseSettings mockParseSettings;
    @Mock
    NodeFilter mockNodeFilter;
    @Mock
    NodeVisitor mockNodeVisitor;
    @Mock
    Evaluator mockEvaluator;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        element = new Element(mockTag, "baseUri", mockAttributes);
    }

    @Test
    public void testHasChildNodes() {
        when(mockChangeNotifyingArrayList.size()).thenReturn(1);
        assertTrue(element.hasChildNodes());
    }

}