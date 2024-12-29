package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestDeleteComment {

    @Test
    public void testDeleteComment() {
        String[] comments = {"comment1", "comment2"};
        Mockito.when(commentsConfiguration.setComment("path", comments)).thenReturn(true);

        boolean result = commentsConfiguration.getAllComments().get("path").contains("comment");

        assertTrue(result);
    }

}