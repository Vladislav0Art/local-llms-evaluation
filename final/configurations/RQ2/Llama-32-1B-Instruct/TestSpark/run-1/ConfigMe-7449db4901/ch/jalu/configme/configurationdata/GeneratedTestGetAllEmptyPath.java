package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestGetAllEmptyPath {

    @Test
    public void testGetAllEmptyPath() {
        String[] comments = {"comment1", "comment2"};
        Mockito.when(commentsConfiguration.setComment("", comments)).thenReturn(true);

        List<String> expectedComments = new ArrayList<>();

        String actualComments = commentsConfiguration.getAllComments().get("");
        assertEquals(expectedComments, actualComments);
    }

}