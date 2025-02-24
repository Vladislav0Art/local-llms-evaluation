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

public class GeneratedSetCommentNoCommentsTest {

    @Test
    public void setCommentNoCommentsTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "testPath";
        commentsConfiguration.setComment(path);
        Map<String, List<String>> comments = commentsConfiguration.getAllComments();
        assertNotNull(comments);
        assertEquals(1, comments.size());
        assertEquals(Collections.emptyList(), comments.get(path));
    }

}