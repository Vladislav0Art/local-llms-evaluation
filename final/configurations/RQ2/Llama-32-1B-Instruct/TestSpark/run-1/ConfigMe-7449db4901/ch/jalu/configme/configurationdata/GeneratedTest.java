package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void testGetComments() {
        String[] comments = {"comment1", "comment2"};
        Mockito.when(commentsConfiguration.setComment("path", comments)).thenReturn(true);

        List<String> expectedComments = new ArrayList<>(Arrays.asList(comments));

        String actualComments = commentsConfiguration.getAllComments().get("path");
        assertEquals(expectedComments, actualComments);
    }

    @Test
    public void testGetAllComments() {
        String[] comments = {"comment1", "comment2"};
        Mockito.when(commentsConfiguration.setComment("path", comments)).thenReturn(true);

        List<String> expectedComments = new ArrayList<>(Arrays.asList(comments));

        String actualComments = commentsConfiguration.getAllComments().get("path");
        assertEquals(expectedComments, actualComments);
    }

    @Test
    public void testGetAllEmptyPath() {
        String[] comments = {"comment1", "comment2"};
        Mockito.when(commentsConfiguration.setComment("", comments)).thenReturn(true);

        List<String> expectedComments = new ArrayList<>();

        String actualComments = commentsConfiguration.getAllComments().get("");
        assertEquals(expectedComments, actualComments);
    }

    @Test
    public void testSetComment() {
        String[] comments = {"comment1", "comment2"};
        Mockito.when(commentsConfiguration.setComment("path", comments)).thenReturn(true);

        boolean result = commentsConfiguration.getAllComments().get("path").contains("comment");

        assertTrue(result);
    }

    @Test
    public void testDeleteComment() {
        String[] comments = {"comment1", "comment2"};
        Mockito.when(commentsConfiguration.setComment("path", comments)).thenReturn(true);

        boolean result = commentsConfiguration.getAllComments().get("path").contains("comment");

        assertTrue(result);
    }

}