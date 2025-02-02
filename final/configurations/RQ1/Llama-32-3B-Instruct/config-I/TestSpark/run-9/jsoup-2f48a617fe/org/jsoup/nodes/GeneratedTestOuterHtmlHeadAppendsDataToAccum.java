package org.jsoup.nodes;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.*;

public class GeneratedTestOuterHtmlHeadAppendsDataToAccum {

    public static void main(String[] args) {
        System.out.println(true);
        System.out.println(false);
    }

    @Test
    public void testOuterHtmlHeadAppendsDataToAccum() {
        Comment comment = new Comment("data");
        String expected = "/* <!-- data --> */";
        Appendable accum = new StringBuilder();
        Comment outerHtmlHead (comment, accum);
        assertEquals(expected, accum.toString());
    }

}