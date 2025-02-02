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
public class GeneratedAsXmlDeclaration_withValidContent_test {

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
    public void asXmlDeclaration_withValidContent_test() throws Exception {
        when(document.body().children()).thenReturn(new Element[]{});
        Comment comment = new Comment("declaration data");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        assertNotNull(xmlDeclaration);
        assertTrue(xmlDeclaration.getData().equals(comment.getData()));
    }

}