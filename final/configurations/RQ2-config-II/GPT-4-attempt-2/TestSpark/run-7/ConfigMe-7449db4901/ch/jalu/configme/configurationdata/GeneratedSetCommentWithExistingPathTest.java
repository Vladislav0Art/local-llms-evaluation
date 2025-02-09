package ch.jalu.configme.configurationdata;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedSetCommentWithExistingPathTest {

    @Test
    public void setCommentWithExistingPathTest() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put("path1", Arrays.asList("comment1", "comment2"));
        CommentsConfiguration configuration = new CommentsConfiguration(commentsMap);

        configuration.setComment("path1", "updated comment1", "updated comment2");
        List<String> updatedComments = configuration.getAllComments().get("path1");
        assertEquals(Arrays.asList("updated comment1", "updated comment2"), updatedComments);
    }

}