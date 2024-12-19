package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestOuterHtmlHead {

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @Test
    public void testOuterHtmlHead() {
        when(out.prettyPrint()).thenReturn(true);
        when(accum.append(any())).thenReturn(accum);
        Comment comment = new Comment("<!-- comment -->");
        comment.outerHtmlHead(accum, 0, out);
        assertEquals("<!--comment-->", accum.toString());
    }

}