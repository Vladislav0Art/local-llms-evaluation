package org.jsoup.nodes;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.*;

public class GeneratedTestDataSetsData {

    public static void main(String[] args) {
        System.out.println(true);
        System.out.println(false);
    }

    @Test
    public void testDataSetsData() {
        Comment comment = new Comment();
        comment.setData("data");
        String actual = comment.getData();
        assertEquals("data", actual);
    }

}