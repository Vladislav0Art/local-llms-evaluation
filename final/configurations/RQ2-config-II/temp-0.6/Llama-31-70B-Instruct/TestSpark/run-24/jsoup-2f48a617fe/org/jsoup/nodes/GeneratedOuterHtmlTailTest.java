package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() {
        Comment comment = Mockito.mock(Comment.class);
        try {
            Appendable accum = Mockito.mock(Appendable.class);
            comment.outerHtmlTail(accum, 0, null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}