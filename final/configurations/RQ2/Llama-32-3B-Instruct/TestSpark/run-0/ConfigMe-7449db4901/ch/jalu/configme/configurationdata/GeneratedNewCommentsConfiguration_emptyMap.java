package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedNewCommentsConfiguration_emptyMap {

    @Test
    public void newCommentsConfiguration_emptyMap() {
        Map<String, List<String>> comments = Collections.emptyMap();
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        assertEquals(Collections.emptyMap(), configuration.getAllComments());
    }

}