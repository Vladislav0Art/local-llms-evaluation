package ch.jalu.configme.configurationdata;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedSetEmptyCommentTest {

    @Test
    public void setEmptyCommentTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path1");

        Map<String, @UnmodifiableView List<String>> allComments = config.getAllComments();
        assertEquals(1, allComments.size());
        assertTrue(allComments.get("path1").isEmpty());
    }

}