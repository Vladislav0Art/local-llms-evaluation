package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedNewCommentsConfiguration_singleEntry {

    @Test
    public void newCommentsConfiguration_singleEntry() {
        Map<String, List<String>> comments = Mockito.mock(Map.class);
        when(comments.containsKey("path")).thenReturn(true);
        when(comments.get("path")).thenReturn(Mockito.mock(List.class));
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        assertEquals(Collections.singletonMap("path", Mockito.anyList()), configuration.getAllComments());
    }

}