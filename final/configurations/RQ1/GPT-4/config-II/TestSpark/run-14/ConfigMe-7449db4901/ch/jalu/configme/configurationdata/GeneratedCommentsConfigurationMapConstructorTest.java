package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedCommentsConfigurationMapConstructorTest {

    @Test
    public void commentsConfigurationMapConstructorTest() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("test.path", Arrays.asList("line1", "line2"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);
        Assert.assertEquals(comments, commentsConfiguration.getAllComments());
    }

}