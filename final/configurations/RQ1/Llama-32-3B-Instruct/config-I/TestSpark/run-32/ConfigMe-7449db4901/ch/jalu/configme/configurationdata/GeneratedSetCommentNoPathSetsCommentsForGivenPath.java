package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class GeneratedSetCommentNoPathSetsCommentsForGivenPath {

    @Test
    public void setCommentNoPathSetsCommentsForGivenPath() {
        String comment1 = "Comment 1";
        String comment2 = "Comment 2";

        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put("path1", Collections.singletonList(comment1));
        commentsMap.put("path2", Arrays.asList(comment2));

        CommentsConfiguration config = new CommentsConfiguration(commentsMap);
        config.setComment("newPath", comment1, comment2);

        assertEquals(Arrays.asList(comment1, comment2), config.comments.get("newPath"));
    }

}