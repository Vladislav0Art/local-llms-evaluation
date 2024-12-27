package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.runner.RunWith;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOuterHtmlTail_PutsEndTagIntoHTML {

    @Mock
    private Document document;

    @Mock
    private Appendable appendable;

    public static final String document_OUTPUT_SETTINGS = "outputSettings";

    @Test
    public void outerHtmlTail_PutsEndTagIntoHTML() {
        String html = "<html><body>";
        appendable.write(html);
        new TextNode("Hello World").outerHtmlTail(appendable, 0, document_OUTPUT_SETTINGS);
        assertEquals("<div> Hello World </div></body></html>", appendable.toString());
    }

}