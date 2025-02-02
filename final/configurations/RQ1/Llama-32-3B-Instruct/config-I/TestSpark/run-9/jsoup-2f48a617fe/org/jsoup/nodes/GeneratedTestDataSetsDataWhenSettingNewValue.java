package org.jsoup.nodes;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.*;

public class GeneratedTestDataSetsDataWhenSettingNewValue {

    public static void main(String[] args) {
        System.out.println(true);
        System.out.println(false);
    }

    @Test
    public void testDataSetsDataWhenSettingNewValue() {
        Comment comment = new Comment("data");
        String newExpected = "new data";
        Comment actual = Comment.setData(comment, newExpected);
        String actualExpected = Comment.getData(actual);
        assertEquals(newExpected, actualExpected);
    }

}