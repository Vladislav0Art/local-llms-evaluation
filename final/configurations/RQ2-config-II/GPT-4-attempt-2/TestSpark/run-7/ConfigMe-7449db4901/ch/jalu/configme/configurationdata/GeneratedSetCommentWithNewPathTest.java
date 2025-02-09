package ch.jalu.configme.configurationdata;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedSetCommentWithNewPathTest {

    @Test
    public void setCommentWithNewPathTest() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment("newPath", "new comment1", "new comment2");

        List<String> newComments = configuration.getAllComments().get("newPath");
        assertEquals(Arrays.asList("new comment1", "new comment2"), newComments);
    }

}