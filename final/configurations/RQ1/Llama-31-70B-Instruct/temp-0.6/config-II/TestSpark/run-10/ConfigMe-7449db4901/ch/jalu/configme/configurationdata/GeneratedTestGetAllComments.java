package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import ch.jalu.configme.configurationdata.CommentsConfiguration;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedTestGetAllComments {

    @Mock
    private CommentsConfiguration commentsConfiguration;

    @Test
    public void testGetAllComments() {
        MockitoAnnotations.initMocks(this);
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("line1", "line2"));
        comments.put("path2", Arrays.asList("line3", "line4"));
        when(commentsConfiguration.getAllComments()).thenReturn(comments);

        Map<String, List<String>> result = commentsConfiguration.getAllComments();

        assertNotNull(result);
        assertEquals(comments, result);
    }

}