package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;
import java.util.Arrays;

public class GeneratedNewCommentConfiguration_setMultipleTimes {

    @Test
    public void newCommentConfiguration_setMultipleTimes() {
        CommentsConfiguration config = new CommentsConfiguration();
        String path = "test";
        List<String> commentLines1 = Arrays.asList("comment1");
        List<String> commentLines2 = Arrays.asList("comment2", "");
        config.setComment(path, commentLines1.get(0), commentLines2.get(0));
        config.setComment(path, commentLines2.get(1));
        Map<String, List<String>> comments = config.getAllComments();
        assertEquals(Collections.singletonMap(path, Collections.singletonList(commentLines2)), comments);
    }

}