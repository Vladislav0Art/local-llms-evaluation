package org.jsoup.nodes;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.*;

public class GeneratedTestToString {

    public static void main(String[] args) {
        System.out.println(true);
        System.out.println(false);
    }

    @Test
    public void testToString() {
        Comment comment = new Comment();
        String expected = "comment content";
        String actual = comment.toString();
        assertEquals(expected, actual);
    }

}