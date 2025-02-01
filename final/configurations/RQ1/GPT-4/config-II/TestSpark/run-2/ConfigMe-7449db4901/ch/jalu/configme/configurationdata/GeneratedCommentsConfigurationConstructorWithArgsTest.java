package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class GeneratedCommentsConfigurationConstructorWithArgsTest {

    @Test
    public void commentsConfigurationConstructorWithArgsTest() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("key1", Arrays.asList("comment1", "comment2"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);
        assertEquals("comments different from expected", comments, commentsConfiguration.getAllComments());
    }

}