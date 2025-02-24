package ch.jalu.configme.configurationdata;

import ch.jalu.configme.SettingsHolder;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void testConstructorWithEmptyMap() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);
        assert commentsConfiguration != null;
    }

    @Test
    public void testConstructorWithFilledMap() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("key1", Arrays.asList("line1", "line2"));
        comments.put("key2", Arrays.asList("line3", "line4"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);
        assert commentsConfiguration != null;
    }

    @Test
    public void testConstructorWithNullMap() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(null);
    }

    @Test
    public void testSetCommentWithEmptyPath() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("", "line1", "line2");
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assert allComments.size() == 1;
        assert allComments.get("").size() == 2;
    }

}