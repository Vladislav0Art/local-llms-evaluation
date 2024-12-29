package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedSetComment_newEntry {

    @Test
    public void setComment_newEntry() {
        Map<String, List<String>> comments = Collections.emptyMap();
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        config.setComment("path", "comment");
        config.setComment("newPath", "newComment");
        assertEquals(Collections.singletonMap("path", Arrays.asList("comment")), configuration.getAllComments());
    }

}