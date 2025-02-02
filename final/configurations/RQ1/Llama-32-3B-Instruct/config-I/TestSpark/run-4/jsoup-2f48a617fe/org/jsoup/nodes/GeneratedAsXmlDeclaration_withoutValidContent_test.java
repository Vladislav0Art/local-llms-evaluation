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
public class GeneratedAsXmlDeclaration_withoutValidContent_test {

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
    public void asXmlDeclaration_withoutValidContent_test() {
        Comment comment = new Comment("");
        assertNull(comment.asXmlDeclaration());
    }

}