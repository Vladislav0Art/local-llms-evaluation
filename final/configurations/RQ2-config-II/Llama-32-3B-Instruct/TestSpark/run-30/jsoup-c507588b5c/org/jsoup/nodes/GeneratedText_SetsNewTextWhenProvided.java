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
public class GeneratedText_SetsNewTextWhenProvided {

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @Test
    public void text_SetsNewTextWhenProvided() {
        String originalText = "original";
        String newText = "new";
        String nodeText = new TextNode(originalText).text(newText);
        assertEquals(newText, nodeText);
    }

}