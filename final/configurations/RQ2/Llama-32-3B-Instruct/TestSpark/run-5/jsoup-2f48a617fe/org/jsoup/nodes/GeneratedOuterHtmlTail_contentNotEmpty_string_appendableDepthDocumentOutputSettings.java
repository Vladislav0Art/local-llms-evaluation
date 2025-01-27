package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.jsoup.nodes.Document.OutputSettings.LAX;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOuterHtmlTail_contentNotEmpty_string_appendableDepthDocumentOutputSettings {

    @Mock
    private Appendable accum;

    @Mock
    private DocumentOutputSettings out;

    @Test
    public void outerHtmlTail_contentNotEmpty_string_appendableDepthDocumentOutputSettings() {
        Comment comment = new Comment("Hello");
        appendable(accum, 1, out);
        Mockito.verify(out).append(Matcher.anyString(), 0, LAX);
        Mockito.verify(accum).append(comment.getData());
    }

    private void appendable(Appendable accum, int depth, DocumentOutputSettings out) throws IOException {
        out.append("<div>", 0, LAX);
        accum.append("<div>");
        accum.append(out.toString(), 1, LAX);
        out.append("</div>", 0, LAX);
        accum.append("</div>");
    }

}