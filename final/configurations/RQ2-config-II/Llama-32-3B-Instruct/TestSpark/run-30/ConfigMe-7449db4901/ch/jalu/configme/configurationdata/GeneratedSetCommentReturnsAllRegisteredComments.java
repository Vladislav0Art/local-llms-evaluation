package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedSetCommentReturnsAllRegisteredComments {

    @Test
    public void setCommentReturnsAllRegisteredComments() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(new HashMap<>());
        Map<String, List<String>> allCommentsBeforeSet = new HashMap<>();
        allCommentsBeforeSet.put("comment", Arrays.asList("line1"));
        Map<String, List<String>> allCommentsAfterSet = commentsConfiguration.setComment("path", "line2").getAllComments();
        assertTrue(allCommentsAfterSet.equals(new HashMap<>() {{
            put("comment", Arrays.asList("line1", "line2"));
        }}));
    }

}