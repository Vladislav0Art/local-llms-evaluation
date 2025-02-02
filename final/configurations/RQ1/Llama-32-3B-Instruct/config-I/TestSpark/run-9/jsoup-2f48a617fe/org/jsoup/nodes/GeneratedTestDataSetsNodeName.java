package org.jsoup.nodes;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.*;

public class GeneratedTestDataSetsNodeName {

    public static void main(String[] args) {
        System.out.println(true);
        System.out.println(false);
    }

    @Test
    public void testDataSetsNodeName() {
        Comment comment = new Comment("data");
        String expected = "data";
        String actual = Comment.getNodeName(comment);
        assertEquals(expected, actual);
    }

}