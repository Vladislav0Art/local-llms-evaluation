package ch.jalu.configme.configurationdata;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class GeneratedConstructorWithParamsTest {

    @Test
    public void constructorWithParamsTest() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put("path1", Arrays.asList("commentLine1", "commentLine2"));

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(commentsMap);
        Assert.assertNotNull(commentsConfiguration.getAllComments());
        Assert.assertEquals(commentsMap, commentsConfiguration.getAllComments());
    }

}