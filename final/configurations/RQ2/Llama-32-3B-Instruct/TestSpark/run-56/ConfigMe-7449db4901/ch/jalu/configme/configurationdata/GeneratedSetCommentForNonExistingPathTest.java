package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentForNonExistingPathTest {

    @Test
    public void setCommentForNonExistingPathTest() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration commentsConfig = new CommentsConfiguration(comments);

        String path = "path2";
        String[] commentLines = {"newComment"};
        commentsConfig.setComment(path, commentLines);
        assertEquals(Collections.singletonList("newComment"), comments.get(path));
    }

}