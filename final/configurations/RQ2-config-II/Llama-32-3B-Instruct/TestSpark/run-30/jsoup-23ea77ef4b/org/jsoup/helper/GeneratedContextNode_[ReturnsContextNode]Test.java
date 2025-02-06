package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedContextNode_[ReturnsContextNode]

Test {

    @Mock
    private DocumentBuilderFactory documentBuilderFactory;

    @Mock
    private DocumentBuilder documentBuilder;

    private W3CDom w3cdom = new W3CDom();

    @Before
    public void setup () {
        MockitoAnnotations.initMocks(this);
    }

    @After
    public void tearDown () {
    }

    @Test
    public void contextNode_[ ReturnsContextNode]Test() {
        Document document = new Document();
        Node contextNode = w3cdom.contextNode(document);
        assertNotNull(contextNode);
        assertTrue(contextNode instanceof Element);
    }

}