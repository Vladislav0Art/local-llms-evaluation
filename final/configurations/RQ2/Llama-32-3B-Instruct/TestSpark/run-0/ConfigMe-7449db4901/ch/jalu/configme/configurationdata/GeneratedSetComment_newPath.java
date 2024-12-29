package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedSetComment_newPath {

    @Test
    public void setComment_newPath() {
        Map<String, List<String>> comments = Collections.emptyMap();
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        config.setComment("newPath", "comment");
        assertEquals(Collections.singletonMap("newPath", Arrays.asList("comment")), configuration.getAllComments());
    }

}