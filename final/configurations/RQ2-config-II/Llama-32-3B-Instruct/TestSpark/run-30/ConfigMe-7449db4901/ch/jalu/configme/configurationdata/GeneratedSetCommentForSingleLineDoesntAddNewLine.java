package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedSetCommentForSingleLineDoesntAddNewLine {

    @Test
    public void setCommentForSingleLineDoesntAddNewLine() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(new HashMap<>());
        Map<String, List<String>> allCommentsBeforeSet = new HashMap<>();
        allCommentsBeforeSet.put("comment", Collections.singletonList(""));
        Map<String, List<String>> allCommentsAfterSet = commentsConfiguration.setComment("path", "").getAllComments();
        assertTrue(allCommentsAfterSet.get("comment").isEmpty());
    }

}