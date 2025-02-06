package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedSetComment_overridesExistingComments {

    @Test
    public void setComment_overridesExistingComments() {
        Map<String, List<String>> comments = Mockito.mock(Map.class);
        ((List<String>) ((List<String>) ((Map) Mockito.mock(Map.class)).get("path"))).clear();
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        configuration.setComment("path", "line1", "line2");
        assertEquals(2, ((List<String>) configuration.getAllComments().get("path")).size());
    }

}