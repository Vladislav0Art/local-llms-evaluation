package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedSetComment_setsSingleEntryForAllPaths {

    @Test
    public void setComment_setsSingleEntryForAllPaths() {
        Map<String, List<String>> comments = Mockito.mock(Map.class);
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        configuration.setComment("path", "");
        assertEquals(1, ((Map<String, @UnmodifiableView List<String>>) configuration.getAllComments()).size());
    }

}