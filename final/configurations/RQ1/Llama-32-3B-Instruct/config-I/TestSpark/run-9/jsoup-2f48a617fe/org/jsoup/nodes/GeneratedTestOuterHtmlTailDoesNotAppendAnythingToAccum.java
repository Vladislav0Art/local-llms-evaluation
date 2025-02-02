package org.jsoup.nodes;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.*;

public class GeneratedTestOuterHtmlTailDoesNotAppendAnythingToAccum {

    public static void main(String[] args) {
        System.out.println(true);
        System.out.println(false);
    }

    @Test
    public void testOuterHtmlTailDoesNotAppendAnythingToAccum() {
        Comment comment = new Comment("");
        Appendable accum = new StringBuilder();
        Comment outerHtmlTail (comment, accum);
        assertEquals("", accum.toString());
    }

}