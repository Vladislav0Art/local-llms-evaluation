package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedSetComment_setsEmptyLineForMultiplePaths {

    @Test
    public void setComment_setsEmptyLineForMultiplePaths() {
        Map<String, List<String>> comments = Mockito.mock(Map.class);
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        configuration.setComment("", "line1", "line2");
        assertEquals(1, ((List<String>) configuration.getAllComments().get("")).size());
    }

}