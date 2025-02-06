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
public class GeneratedIsBlank_ReturnsFalseNonBlankText {

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @Test
    public void isBlank_ReturnsFalseNonBlankText() {
        String nonBlankText = "test";
        boolean result = new TextNode(nonBlankText).isBlank();
        assertFalse(result);
    }

}