package org.jsoup.nodes;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.*;

public class GeneratedTestOuterHtmlTail {

    public static void main(String[] args) {
        System.out.println(true);
        System.out.println(false);
    }

    @Test
    public void testOuterHtmlTail() {
        Comment comment = new Comment();
        Appendable accum = mock(Appendable.class);
        comment.outerHtmlTail(accum, "content");
        verify(accum).append("content");
    }

}