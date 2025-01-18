package ch.jalu.configme.configurationdata;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedCommentsConfigurationMapConstructorTest {

    @Test
    public void commentsConfigurationMapConstructorTest() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path", Collections.singletonList("comment line"));

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);
        Assert.assertNotNull(commentsConfiguration);
    }

}