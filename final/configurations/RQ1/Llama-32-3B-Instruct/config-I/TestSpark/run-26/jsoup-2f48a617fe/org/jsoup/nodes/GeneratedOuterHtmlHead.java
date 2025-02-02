package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOuterHtmlHead {

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @Test
    public void outerHtmlHead() {
        Comment comment = new Comment("data");
        when(out.prettyPrint()).thenReturn(true);
        when(accum.append(anyString())).thenReturn(accum);
        when(accum.length()).thenReturn(0);

        Comment expectedComment = new Comment("data");
        when(comment.coreValue()).thenReturn(data -> data);
        expectedComment.outerHtmlHead(accum, 1, out);
    }

}