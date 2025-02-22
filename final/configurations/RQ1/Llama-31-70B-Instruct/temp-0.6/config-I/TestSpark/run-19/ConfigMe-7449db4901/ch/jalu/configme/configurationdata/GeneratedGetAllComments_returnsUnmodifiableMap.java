package ch.jalu.configme.configurationdata;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedGetAllComments_returnsUnmodifiableMap {

    private CommentsConfiguration commentsConfiguration;

    @Before
    public void setup() {
        commentsConfiguration = new CommentsConfiguration();
    }

    @Test
    public void getAllComments_returnsUnmodifiableMap() {
        Map<String, List<String>> expectedComments = new HashMap<>();
        expectedComments.put("path1", Arrays.asList("comment1", "comment2"));
        Map<String, List<String>> mockMap = Mockito.mock(Map.class);
        when(mockMap.get("path1")).thenReturn(expectedComments.get("path1"));
        commentsConfiguration.comments = mockMap;

        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertEquals(expectedComments, allComments);
    }

}