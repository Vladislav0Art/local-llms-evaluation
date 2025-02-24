package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import ch.jalu.configme.SettingsHolder;
import ch.jalu.configme.configurationdata.CommentsConfiguration;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class GeneratedSetCommentEmptyCommentTest {

    @Test
    public void setCommentEmptyCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "testPath";
        String comment1 = "";
        commentsConfiguration.setComment(path, comment1);
        Map<String, List<String>> comments = commentsConfiguration.getAllComments();
        assertNotNull(comments);
        assertEquals(1, comments.size());
        assertEquals(Arrays.asList(""), comments.get(path));
    }

}