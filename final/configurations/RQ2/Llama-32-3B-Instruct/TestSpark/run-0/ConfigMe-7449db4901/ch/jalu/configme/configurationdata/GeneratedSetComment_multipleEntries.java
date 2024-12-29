package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedSetComment_multipleEntries {

    @Test
    public void setComment_multipleEntries() {
        Map<String, List<String>> comments = Collections.emptyMap();
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        config.setComment("path1", "comment1");
        config.setComment("path2", "comment2");
        assertEquals(Arrays.asList(Collections.singletonMap("path1", Arrays.asList("comment1")), Collections.singletonMap("path2", Arrays.asList("comment2"))), configuration.getAllComments());
    }

}