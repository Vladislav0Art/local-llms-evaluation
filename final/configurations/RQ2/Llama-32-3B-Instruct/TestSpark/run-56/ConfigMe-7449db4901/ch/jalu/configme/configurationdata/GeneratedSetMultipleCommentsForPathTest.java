package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetMultipleCommentsForPathTest {

    @Test
    public void setMultipleCommentsForPathTest() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration commentsConfig = new CommentsConfiguration(comments);

        String path = "path1";
        String[] commentLines = {"comment1", "newComment"};
        commentsConfig.setComment(path, commentLines);
        assertEquals(Arrays.asList("comment1", "newComment"), comments.get(path));
    }

}