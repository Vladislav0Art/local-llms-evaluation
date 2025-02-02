package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class GeneratedSetCommentOverwritesExistingComments {

    @Test
    public void setCommentOverwritesExistingComments() {
        String comment1 = "Comment 1";
        String comment2 = "Comment 2";

        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put("path1", Arrays.asList(comment1));
        commentsMap.put("path2", Collections.singletonList(comment2));

        CommentsConfiguration config = new CommentsConfiguration(commentsMap);
        config.setComment("newPath", comment1);

        assertEquals(Arrays.asList(comment1), config.comments.get("newPath"));
    }

}