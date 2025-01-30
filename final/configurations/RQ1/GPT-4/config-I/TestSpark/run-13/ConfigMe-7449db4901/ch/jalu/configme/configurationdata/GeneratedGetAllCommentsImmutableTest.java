package ch.jalu.configme.configurationdata;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedGetAllCommentsImmutableTest {

    @Test
    public void getAllCommentsImmutableTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("testPath", "Line1", "Line2");

        Map<String, List<String>> comments = commentsConfiguration.getAllComments();

        comments.put("illegalPath", Arrays.asList("IllegalLine"));
    }

}