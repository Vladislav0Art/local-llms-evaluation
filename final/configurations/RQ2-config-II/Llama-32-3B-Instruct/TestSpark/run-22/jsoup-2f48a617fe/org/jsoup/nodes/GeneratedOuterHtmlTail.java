package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOuterHtmlTail {

    @Mock
    private Appendable accum;

    @Test
    public void outerHtmlTail() {
        when(accum.append()).thenReturn(true);
        Comment comment = new Comment("data");
        Document.OutputSettings out = new Document.OutputSettings();
        comment.outerHtmlTail(accum, 0, out);
        assertNotNull(accum.toString());
    }

}