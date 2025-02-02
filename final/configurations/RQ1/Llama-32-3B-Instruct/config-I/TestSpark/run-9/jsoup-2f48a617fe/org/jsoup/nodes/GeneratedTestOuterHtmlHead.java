package org.jsoup.nodes;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.*;

public class GeneratedTestOuterHtmlHead {

    public static void main(String[] args) {
        System.out.println(true);
        System.out.println(false);
    }

    @Test
    public void testOuterHtmlHead() {
        Comment comment = new Comment();
        Appendable accum = mock(Appendable.class);
        comment.outerHtmlHead(accum, "content");
        verify(accum).append("content");
    }

}