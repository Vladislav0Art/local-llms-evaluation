package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedSetCommentAddsEmptyLine {

    @Test
    public void setCommentAddsEmptyLine() {
        Map<String, List<String>> existingComments = new HashMap<>();
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path1", "", "\n");
        assertEquals(1, commentsConfiguration.comments.size());
        assertTrue(commentsConfiguration.comments.containsKey("path1"));
    }

}