package org.jsoup.nodes;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.*;

public class GeneratedTestToStringReturnsOuterHtml {

    public static void main(String[] args) {
        System.out.println(true);
        System.out.println(false);
    }

    @Test
    public void testToStringReturnsOuterHtml() {
        Comment comment = new Comment("data");
        String expected = "/* <!-- data --> */";
        String actual = comment.toString();
        assertEquals(expected, actual);
    }

}