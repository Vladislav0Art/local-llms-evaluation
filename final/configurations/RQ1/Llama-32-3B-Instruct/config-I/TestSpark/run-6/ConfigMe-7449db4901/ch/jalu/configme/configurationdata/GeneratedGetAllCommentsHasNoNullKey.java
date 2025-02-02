package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetAllCommentsHasNoNullKey {

    @Test
    public void getAllCommentsHasNoNullKey() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        Map<String, @UnmodifiableView List<String>> map = commentsConfig.getAllComments();
        assertTrue(map instanceof java.util.HashMap);
        assertFalse(map.containsKey(null));
    }

}