package ch.jalu.configme.configurationdata;

import ch.jalu.configme.SettingsHolder;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void constructorDefaultTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        Assert.assertNotNull(commentsConfiguration.comments);
        Assert.assertEquals(0, commentsConfiguration.comments.size());
    }

    @Test
    public void constructorWithMapTest() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put("path", Arrays.asList("comment"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(commentsMap);
        Assert.assertNotNull(commentsConfiguration.comments);
        Assert.assertEquals(1, commentsConfiguration.comments.size());
        Assert.assertEquals(1, commentsConfiguration.comments.get("path").size());
        Assert.assertEquals("comment", commentsConfiguration.comments.get("path").get(0));
    }

}