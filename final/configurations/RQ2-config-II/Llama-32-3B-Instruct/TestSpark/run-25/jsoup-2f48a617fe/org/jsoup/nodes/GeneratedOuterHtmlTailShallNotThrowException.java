package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOuterHtmlTailShallNotThrowException {

    @Mock
    private Appendable accum;

    @Test
    public void outerHtmlTailShallNotThrowException() {
        when(accum.append(anyString())).thenReturn(null);
        Comment comment = new Comment("");
        comment.outerHtmlTail(accum, 0, null);
        // No exception is thrown.
    }

}