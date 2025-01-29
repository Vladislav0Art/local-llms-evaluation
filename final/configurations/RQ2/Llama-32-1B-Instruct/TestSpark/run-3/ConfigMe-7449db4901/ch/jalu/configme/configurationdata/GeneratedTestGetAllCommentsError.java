package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedTestGetAllCommentsError {

    @Mock
    public Map<String, List<String>> getComments() {
        return new HashMap<>();
    }

    @InjectMocks
    private CommentsConfiguration commentsConfiguration;

    @Test
    public void testGetAllCommentsError() {
        CommentsConfiguration.Result result = new CommentsConfiguration.Result();
        when(getComments()).thenReturn(result);
        commentsConfiguration.setComment("path", Collections.emptyList());

        try {
            commentsConfiguration.getAllComments();
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }

        commentsConfiguration.setComment("path", Arrays.asList("line1"));
        Map<String, List<String>> result = commentsConfiguration.getAllComments();

        assertNotNull(result);
        assertEquals(2, result.size());
    }

}