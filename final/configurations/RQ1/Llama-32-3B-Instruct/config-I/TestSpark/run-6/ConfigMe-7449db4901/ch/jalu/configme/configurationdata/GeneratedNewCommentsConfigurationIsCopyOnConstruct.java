package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedNewCommentsConfigurationIsCopyOnConstruct {

    @Test
    public void newCommentsConfigurationIsCopyOnConstruct() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put("key", Arrays.asList("value"));
        CommentsConfiguration commentsConfig = new CommentsConfiguration(commentsMap);
        assertNotNull(commentsConfig.comments);
        assertEquals(0, commentsConfig.comments.size());
    }

}