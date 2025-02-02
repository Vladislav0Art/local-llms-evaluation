package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOuterHtmlHead_appendsCommentDataToAccum {

    @Mock
    private LeafNode parentNode;

    @Mock
    private Appendable accum;

    @Test
    public void outerHtmlHead_appendsCommentDataToAccum() throws Exception {
        String data = "This is a comment";
        Comment comment = new Comment(data);
        comment.outerHtmlHead(accum, 0, null);
        assertEquals("<!--" + data + "-->", accum.toString());
    }

}