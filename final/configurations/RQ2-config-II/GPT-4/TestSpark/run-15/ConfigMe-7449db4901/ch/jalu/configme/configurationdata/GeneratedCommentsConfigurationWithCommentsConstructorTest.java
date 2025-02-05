package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedCommentsConfigurationWithCommentsConstructorTest {

    @Test
    public void commentsConfigurationWithCommentsConstructorTest() {
        String key = "path";
        List<String> comment = Arrays.asList("comment1", "comment2");
        Map<String, List<String>> comments = new HashMap<>();
        comments.put(key, comment);

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);
        assertEquals(comments, commentsConfiguration.getAllComments());
    }

}