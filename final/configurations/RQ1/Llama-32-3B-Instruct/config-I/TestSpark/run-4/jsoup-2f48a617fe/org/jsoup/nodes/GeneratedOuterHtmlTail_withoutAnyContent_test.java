package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOuterHtmlTail_withoutAnyContent_test {

    @Mock
    private Document document;

    @Mock
    private Appendable appendable;

    @Mock
    private OutputSettings outputSettings;

    public static void indent(Appendable accum, int depth, OutputSettings out) {
        // dummy implementation for mocking purposes only
    }

    @Test
    public void outerHtmlTail_withoutAnyContent_test() {
        Comment comment = new Comment("");
        comment.setNodeName("#comment");
        comment.outerHtmlTail(appendable, 0, outputSettings);
        assertEquals("", appendable.toString());
    }

}