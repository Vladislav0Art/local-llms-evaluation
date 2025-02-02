package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class GeneratedSetCommentSetsSingleEmptyLineForNewEntry {

    @Test
    public void setCommentSetsSingleEmptyLineForNewEntry() {
        String comment1 = "Comment 1";

        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put("path1", Collections.singletonList(comment1));

        CommentsConfiguration config = new CommentsConfiguration(commentsMap);
        config.setComment("newPath");

        assertEquals(Collections.singletonList(""), config.comments.get("newPath"));
    }

}