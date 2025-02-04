package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.HashMap;
import java.util.Collections;

public class GeneratedGetAllComments_test {

    @Test
    public void getAllComments_test() {
        CommentsConfiguration config = new CommentsConfiguration();
        Map<String, List<String>> commentsMap = new HashMap<>();
        String comment1 = "Comment 1";
        String comment2 = "Comment 2";
        commentsMap.put("path", Arrays.asList(comment1, comment2));
        config.comments = commentsMap;
        assertEquals(1, ((List<String>) config.getAllComments().get("path")).size());
    }

}