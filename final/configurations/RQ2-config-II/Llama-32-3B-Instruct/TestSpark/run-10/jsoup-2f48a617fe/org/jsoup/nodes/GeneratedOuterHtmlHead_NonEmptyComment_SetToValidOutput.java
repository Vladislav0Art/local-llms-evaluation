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

public class GeneratedOuterHtmlHead_NonEmptyComment_SetToValidOutput {

    @Test
    public void outerHtmlHead_NonEmptyComment_SetToValidOutput() throws IOException {
        Comment comment = new Comment("non-empty-data");
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        when(out.append(anyString())).thenReturn(null);
        document(out).outerHtmlHead(accum, 0, out);
        verify(accum, times(1)).append(eq("<!--non-empty-data-->"));
    }

}