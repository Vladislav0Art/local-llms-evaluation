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
public class GeneratedCreateFromEncoded_DoesNotThrowException {

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @Test
    public void createFromEncoded_DoesNotThrowException() {
        String encodedText = "";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertNotNull(node);
    }

}