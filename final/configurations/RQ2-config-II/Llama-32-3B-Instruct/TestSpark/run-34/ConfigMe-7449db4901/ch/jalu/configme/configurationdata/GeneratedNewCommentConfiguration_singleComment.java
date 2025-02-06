package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;
import java.util.Arrays;

public class GeneratedNewCommentConfiguration_singleComment {

    @Test
    public void newCommentConfiguration_singleComment() {
        CommentsConfiguration config = new CommentsConfiguration();
        String path = "test";
        List<String> commentLines = Arrays.asList("comment");
        config.setComment(path, commentLines.get(0));
        Map<String, List<String>> comments = config.getAllComments();
        assertEquals(Collections.singletonMap(path, Collections.singletonList(commentLines.get(0))), comments);
    }

}