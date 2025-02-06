package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNodeName_DoesntWorkWhenBlank {

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @Test
    public void nodeName_DoesntWorkWhenBlank() {
        String text = "";
        String nodeName = new TextNode(text).nodeName();
        assertNull(nodeName);
    }

}