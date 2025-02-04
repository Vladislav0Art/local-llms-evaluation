package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedNewCommentsConfiguration_isCreatedWithPassedArguments {

    @Test
    public void newCommentsConfiguration_isCreatedWithPassedArguments() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put("test", Arrays.asList("comment1", "comment2"));
        CommentsConfiguration config = new CommentsConfiguration(commentsMap);
        assertEquals(commentsMap, config.comments);
    }

}