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
public class GeneratedOuterHtmlHead_noContent_emptyString_appendableDepthDocumentOutputSettings {

    @Mock
    private Appendable accum;

    @Mock
    private DocumentOutputSettings out;

    @Test
    public void outerHtmlHead_noContent_emptyString_appendableDepthDocumentOutputSettings() throws IOException {
        Comment comment = new Comment("");
        appendable(accum, 1, out);
        Mockito.verify(out).append(Matcher.anyString(), 0, LAX);
        Mockito.verify(accum).append(Matcher.anyString());
    }

}