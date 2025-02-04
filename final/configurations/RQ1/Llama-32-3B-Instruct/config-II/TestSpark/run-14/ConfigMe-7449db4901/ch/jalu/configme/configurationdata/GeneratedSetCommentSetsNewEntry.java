package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedSetCommentSetsNewEntry {

    @Test
    public void setCommentSetsNewEntry() {
        Map<String, List<String>> existingComments = new HashMap<>();
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path1", "comment1");
        assertEquals(1, commentsConfiguration.comments.size());
        assertTrue(commentsConfiguration.comments.containsKey("path1"));
    }

}