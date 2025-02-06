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
public class GeneratedCreateFromString_GivenEncodedText_ReturnsTextNode {

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
    public void createFromString_GivenEncodedText_ReturnsTextNode() throws IOException {
        String encodedText = "Hello%20World!";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertEquals("Hello World!", textNode.text());
    }

}