package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedSetCommentWithEmptyLineSetsCorrectEntry {

    @Test
    public void setCommentWithEmptyLineSetsCorrectEntry() {
        Map<String, List<String>> comments = Mockito.mock(Map.class);
        Mockito.when(comments.get("path")).thenReturn(Collections.emptyList());
        CommentsConfiguration commentConfig = new CommentsConfiguration(comments);
        String line1 = "line1";
        String line2 = "";
        commentConfig.setComment("path", line1, line2);
        assertNotNull(commentConfig.getAllComments());
        assertEquals(1, ((List<String>) commentConfig.getAllComments().get("path")).size());
    }

}