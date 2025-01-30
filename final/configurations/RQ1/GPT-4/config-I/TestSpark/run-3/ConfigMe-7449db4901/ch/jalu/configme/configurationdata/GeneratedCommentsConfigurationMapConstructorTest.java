package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedCommentsConfigurationMapConstructorTest {

    @Test
    public void commentsConfigurationMapConstructorTest() {
        Map<String, List<String>> initialComments = new HashMap<>();
        initialComments.put("path1", List.of("Comment Line"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(initialComments);
        Assert.assertEquals(initialComments, commentsConfiguration.getAllComments());
    }

}