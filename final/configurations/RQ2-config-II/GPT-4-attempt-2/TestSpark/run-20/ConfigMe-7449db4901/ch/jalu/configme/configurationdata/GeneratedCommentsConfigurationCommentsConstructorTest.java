package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

public class GeneratedCommentsConfigurationCommentsConstructorTest {

    @Test
    public void commentsConfigurationCommentsConstructorTest() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("comment1", "comment2"));
        comments.put("path2", Arrays.asList("comment3", "comment4"));

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);
        assertEquals(comments, commentsConfiguration.getAllComments());
    }

}