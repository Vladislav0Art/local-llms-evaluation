package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetAllComments_returnsAllPaths {

    @Test
    public void getAllComments_returnsAllPaths() {
        Map<String, List<String>> comments = Collections.singletonMap("path", Arrays.asList("line1", "line2"));
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        assertEquals(1, ((Map<String, @UnmodifiableView List<String>>) configuration.getAllComments()).size());
    }

}