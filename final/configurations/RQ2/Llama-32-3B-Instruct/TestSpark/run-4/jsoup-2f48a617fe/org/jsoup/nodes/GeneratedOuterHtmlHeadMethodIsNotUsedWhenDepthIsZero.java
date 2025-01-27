package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOuterHtmlHeadMethodIsNotUsedWhenDepthIsZero {

    @Mock
    private Document document;

    @Mock
    private Appendable appendable;

    @InjectMocks
    private Comment comment;

    @Test
    public void OuterHtmlHeadMethodIsNotUsedWhenDepthIsZero() {
        int depth = 0;
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        // given
        when(comment.outerHtmlHead(any(), zeroOrMore(1), any())).thenReturn(document);
        // when
        comment.outerHtmlHead(appendable, depth, outputSettings);
        // then
        verifyNoCallToPrint();
    }

}