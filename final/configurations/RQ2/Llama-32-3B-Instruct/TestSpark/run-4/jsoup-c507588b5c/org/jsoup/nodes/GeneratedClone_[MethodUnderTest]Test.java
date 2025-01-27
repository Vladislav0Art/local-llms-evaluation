package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedClone_[MethodUnderTest]

Test {

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @Mock
    private LeafNode parent;

    public TextNode testTextNode () {
        return new TextNode("Hello World");
    }

    @Test
    public void clone_[ MethodUnderTest]Test() {
        TextNode node = new TextNode("Hello World");
        TextNode cloned = testTextNode().clone();
        when(parent.nodeName()).thenReturn("");
        when(testTextNode().nodeName()).thenReturn(cloned.nodeName());
        assertTrue(node.text().equals(cloned.text()));
    }

}