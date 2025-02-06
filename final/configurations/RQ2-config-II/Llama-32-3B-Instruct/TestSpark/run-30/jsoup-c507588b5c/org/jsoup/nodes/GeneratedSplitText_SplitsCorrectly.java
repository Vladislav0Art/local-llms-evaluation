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
public class GeneratedSplitText_SplitsCorrectly {

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @Test
    public void splitText_SplitsCorrectly() throws IOException {
        String originalText = "test";
        int offset = 3;
        String[] parts = new TextNode(originalText).splitText(offset).toString().split("");
        assertEquals(2, parts.length);
    }

}