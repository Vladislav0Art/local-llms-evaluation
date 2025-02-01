package ch.jalu.configme.configurationdata;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedCommentsConfigurationParametrizedConstructorTest {

    @Test
    public void commentsConfigurationParametrizedConstructorTest() {
        Map<String, List<String>> commentMap = new HashMap<>();
        commentMap.put("path", Arrays.asList("This is a comment"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(commentMap);
        Assert.assertEquals(commentMap, commentsConfiguration.getAllComments());
    }

}