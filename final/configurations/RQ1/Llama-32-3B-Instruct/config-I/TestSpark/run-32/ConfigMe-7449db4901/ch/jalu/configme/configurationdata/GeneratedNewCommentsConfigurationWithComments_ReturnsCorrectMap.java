package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class GeneratedNewCommentsConfigurationWithComments_ReturnsCorrectMap {

    @Test
    public void newCommentsConfigurationWithComments_ReturnsCorrectMap() {
        String comment1 = "Comment 1";
        String comment2 = "Comment 2";

        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put("path1", Arrays.asList(comment1));
        commentsMap.put("path2", Collections.singletonList(comment2));

        CommentsConfiguration config = new CommentsConfiguration(commentsMap);
        assertEquals(2, config.comments.size());
    }

}