package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    @Mock
    private Map<String, List<String>> comments;

    public void testSetComment_SingleLine() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path", "line1");
        when(comments.get("path")).thenReturn(Collections.emptyList());
        assertCommentsConfiguration(commentsConfiguration, "path", "line1");

        Mockito.verifyNoMoreInteractions(comments);
    }

    public void testSetComment_MultipleLines() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path", "line1\nline2");
        when(comments.get("path")).thenReturn(Collections.singletonList("line1"));
        assertCommentsConfiguration(commentsConfiguration, "path", "line1\nline2");

        Mockito.verifyNoMoreInteractions(comments);
    }

    public void testGetAllComments_EmptyMap() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        when(comments.get("path")).thenReturn(Collections.emptyList());
        mapAssertionsEmpty(commentsConfiguration.getAllComments());
    }

    public void testGetAllComments_SingleLine() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path", "line1");
        when(comments.get("path")).thenReturn(Collections.singletonList("line1"));
        assertCommentsConfiguration(commentsConfiguration, "path", "line1");

        Mockito.verifyNoMoreInteractions(comments);
    }

    public void testGetAllComments_MultipleLines() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path", "line1\nline2");
        when(comments.get("path")).thenReturn(Collections.singletonList("line1"));
        assertCommentsConfiguration(commentsConfiguration, "path", "line1\nline2");

        Mockito.verifyNoMoreInteractions(comments);
    }

    public void testSetComment_NullPath() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        when(comments.get(null)).thenReturn(Collections.emptyList());
        assertCommentsConfiguration(commentsConfiguration, null, "line1\nline2");
    }

}