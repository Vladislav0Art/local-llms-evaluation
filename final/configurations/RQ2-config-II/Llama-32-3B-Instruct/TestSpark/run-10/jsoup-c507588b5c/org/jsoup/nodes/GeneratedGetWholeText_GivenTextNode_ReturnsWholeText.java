package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Node;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;

@RunWith(org.junit.runner.JUnit4ClassRunner.class)
public class GeneratedGetWholeText_GivenTextNode_ReturnsWholeText {

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @Mock
    private LeafNode parent;

    @Mock
    private Node child;

    private List<Node> nodes = new ArrayList<>();

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getWholeText_GivenTextNode_ReturnsWholeText() throws IOException {
        String text = "Hello World!";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.getWholeText());
    }

}