package ch.jalu.configme.configurationdata;

import ch.jalu.configme.SettingsHolder;
import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedSetCommentTest2 {

    @Test
    public void setCommentTest2() {
        CommentsConfiguration config = new CommentsConfiguration();
        String path = "test";
        String comment1 = "comment1";
        String comment2 = "comment2";
        config.setComment(path, comment1, comment2);
        Map<String, List<String>> comments = config.getAllComments();
        assertTrue(comments.containsKey(path));
        List<String> commentList = comments.get(path);
        assertEquals(Arrays.asList(comment1, comment2), commentList);
    }

}