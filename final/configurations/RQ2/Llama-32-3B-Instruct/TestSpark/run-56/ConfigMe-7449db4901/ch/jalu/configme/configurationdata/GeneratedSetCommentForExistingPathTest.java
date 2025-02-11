package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentForExistingPathTest {

    @Test
    public void setCommentForExistingPathTest() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Collections.singletonList("comment1"));
        CommentsConfiguration commentsConfig = new CommentsConfiguration(comments);

        String path = "path1";
        String[] commentLines = {"newComment"};
        commentsConfig.setComment(path, commentLines);
        assertEquals(Arrays.asList("newComment"), comments.get(path));
    }

}