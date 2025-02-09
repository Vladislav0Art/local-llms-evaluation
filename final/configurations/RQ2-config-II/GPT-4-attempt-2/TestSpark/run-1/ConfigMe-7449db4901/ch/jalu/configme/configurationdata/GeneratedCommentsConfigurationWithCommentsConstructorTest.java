package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedCommentsConfigurationWithCommentsConstructorTest {

    @Test
    public void commentsConfigurationWithCommentsConstructorTest() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("testPath", Arrays.asList("comment1", "comment2"));

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);

        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertEquals(comments, allComments);
    }

}