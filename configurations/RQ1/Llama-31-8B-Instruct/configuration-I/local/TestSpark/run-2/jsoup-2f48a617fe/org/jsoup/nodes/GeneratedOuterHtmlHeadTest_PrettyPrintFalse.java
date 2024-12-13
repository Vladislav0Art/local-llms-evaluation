package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.NodeUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.io.Appendable;
import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(JUnit4.class)
public class GeneratedOuterHtmlHeadTest_PrettyPrintFalse {

    @Test
    public void outerHtmlHeadTest_PrettyPrintFalse() throws IOException {
        Comment comment = new Comment("test");
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        when(out.prettyPrint()).thenReturn(false);
        comment.outerHtmlHead(accum, 0, out);
        verify(accum).append("<!--test-->").append("-->");
    }

}