package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedOuterHtmlTail_MultipleComments_SetToValidOutput {

    @Test
    public void outerHtmlTail_MultipleComments_SetToValidOutput() {
        Comment comment1 = new Comment("data-1");
        Comment comment2 = new Comment("data-2");
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        when(out.append(anyString())).thenReturn(null);
        document(out).outerHtmlTail(accum, 0, out);
        verify(accum, times(3)).append(eq("<!--data-1-->"));
        verify(accum, times(2)).append(eq("<!--data-2-->"));
    }

}