package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedSetCommentWithMultipleLinesSetsCorrectEntry {

    @Test
    public void setCommentWithMultipleLinesSetsCorrectEntry() {
        Map<String, List<String>> comments = Mockito.mock(Map.class);
        Mockito.when(comments.get("path")).thenReturn(Collections.emptyList());
        CommentsConfiguration commentConfig = new CommentsConfiguration(comments);
        String line1 = "line1";
        String line2 = "line2";
        commentConfig.setComment("path", line1, line2);
        assertNotNull(commentConfig.getAllComments());
        assertEquals(2, ((List<String>) commentConfig.getAllComments().get("path")).size());
    }

}