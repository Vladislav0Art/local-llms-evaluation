package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedSetComment_setsCommentsForAllPaths {

    @Test
    public void setComment_setsCommentsForAllPaths() {
        Map<String, List<String>> comments = Mockito.mock(Map.class);
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        configuration.setComment("path1", "line1", "line2");
        assertEquals(3, ((Map<String, @UnmodifiableView List<String>>) configuration.getAllComments()).size());
    }

}