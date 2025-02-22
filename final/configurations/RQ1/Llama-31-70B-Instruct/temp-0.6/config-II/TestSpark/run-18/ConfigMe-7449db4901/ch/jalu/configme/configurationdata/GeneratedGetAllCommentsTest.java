package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import ch.jalu.configme.configurationdata.CommentsConfiguration;

public class GeneratedGetAllCommentsTest {

    @Test
    public void getAllCommentsTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        Map<String, List<String>> mockMap = mock(Map.class);
        when(mockMap.size()).thenReturn(1);
        commentsConfiguration.setComment("testPath", "testComment");
        assertEquals(1, commentsConfiguration.getAllComments().size());
    }

}