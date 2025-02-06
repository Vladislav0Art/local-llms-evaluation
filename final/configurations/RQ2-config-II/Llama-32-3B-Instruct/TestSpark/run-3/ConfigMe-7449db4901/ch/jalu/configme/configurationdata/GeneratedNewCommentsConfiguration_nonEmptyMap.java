package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedNewCommentsConfiguration_nonEmptyMap {

    @Test
    public void newCommentsConfiguration_nonEmptyMap() {
        Map<String, List<String>> comments = Collections.singletonMap("path", Arrays.asList("line1", "line2"));
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        assertEquals(1, configuration.getAllComments().size());
    }

}