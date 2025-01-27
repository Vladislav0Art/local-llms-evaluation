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
public class GeneratedOuterHtmlTailMethodIsUsedWhenDepthIsPositive {

    @Mock
    private Document document;

    @Mock
    private Appendable appendable;

    @InjectMocks
    private Comment comment;

    @Test
    public void OuterHtmlTailMethodIsUsedWhenDepthIsPositive() {
        int depth = 1;
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        comment.outerHtmlHead(appendable, depth, outputSettings);
        // when
        comment.outerHtmlTail(appendable, depth, outputSettings);
        verify(appendable).print(anyString());
    }

}