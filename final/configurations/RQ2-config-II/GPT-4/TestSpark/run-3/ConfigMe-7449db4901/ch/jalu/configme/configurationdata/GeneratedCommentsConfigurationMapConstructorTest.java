package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.jetbrains.annotations.UnmodifiableView;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedCommentsConfigurationMapConstructorTest {

    @Test
    public void commentsConfigurationMapConstructorTest() {
        Map<String, List<String>> commentMap = new HashMap<>();
        List<String> comments = Arrays.asList("comment1", "comment2");
        commentMap.put("key", comments);

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(commentMap);
        assertEquals(commentsConfiguration.getAllComments().get("key"), comments);
    }

}