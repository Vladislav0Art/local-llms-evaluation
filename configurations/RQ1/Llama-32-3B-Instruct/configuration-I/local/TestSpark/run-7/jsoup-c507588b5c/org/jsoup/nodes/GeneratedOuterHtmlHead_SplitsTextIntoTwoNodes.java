package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(org.junit.runners.JUnit4.class)
public class GeneratedOuterHtmlHead_SplitsTextIntoTwoNodes {

    public Node parentNode = new Node() {
        @Override
        public String toString() {
            return "";
        }
    };

    public Appendable accum = new StringBuilder();

    public Document.OutputSettings out = new Document.OutputSettings();

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    public String getWholeText() {
        return "Hello World";
    }

    public String text() {
        return "Hello World";
    }

    public TextNode clone() {
        return this;
    }

    public String outerHtml() {
        return "Hello World";
    }

    @Test
    public void outerHtmlHead_SplitsTextIntoTwoNodes() {
        when(parentNode).thenReturn(this);
        when(out.prettyPrint()).thenReturn(true);

        StringBuilder accum = new StringBuilder();
        int depth = 0;

        outerHtmlHead(accum, depth, out);
        assertEquals("Hello\r\nWorld", accum.toString());
    }

}