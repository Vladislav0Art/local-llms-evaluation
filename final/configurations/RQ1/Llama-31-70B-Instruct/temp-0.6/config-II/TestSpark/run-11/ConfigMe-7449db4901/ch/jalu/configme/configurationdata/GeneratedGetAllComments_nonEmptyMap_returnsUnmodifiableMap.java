package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetAllComments_nonEmptyMap_returnsUnmodifiableMap {

    @Test
    public void getAllComments_nonEmptyMap_returnsUnmodifiableMap() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path", "comment");
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertFalse(allComments.isEmpty());
        try {
            allComments.put("newPath", Collections.singletonList("newComment"));
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

}