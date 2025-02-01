package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedCommentsConfigurationConstructorWithMapArgsTest {

    @Test
    public void commentsConfigurationConstructorWithMapArgsTest() {
        // Given
        Map<String, List<String>> commentMap = new HashMap<>();
        commentMap.put("Path1", Arrays.asList("Comment1"));

        // When
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(commentMap);

        // Then
        Assert.assertEquals(1, commentsConfiguration.getAllComments().size());
    }

}