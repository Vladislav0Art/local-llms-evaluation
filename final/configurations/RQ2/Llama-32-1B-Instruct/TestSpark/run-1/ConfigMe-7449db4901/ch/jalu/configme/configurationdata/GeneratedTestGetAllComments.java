package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestGetAllComments {

    @Test
    public void testGetAllComments() {
        String[] comments = {"comment1", "comment2"};
        Mockito.when(commentsConfiguration.setComment("path", comments)).thenReturn(true);

        List<String> expectedComments = new ArrayList<>(Arrays.asList(comments));

        String actualComments = commentsConfiguration.getAllComments().get("path");
        assertEquals(expectedComments, actualComments);
    }

}