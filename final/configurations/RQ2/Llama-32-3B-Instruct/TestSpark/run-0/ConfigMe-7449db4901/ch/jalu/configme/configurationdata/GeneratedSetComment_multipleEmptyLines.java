package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedSetComment_multipleEmptyLines {

    @Test
    public void setComment_multipleEmptyLines() {
        Map<String, List<String>> comments = Collections.emptyMap();
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        config.setComment("path1", "\n");
        config.setComment("path2", "");
        assertEquals(Arrays.asList(Collections.singletonMap("path1", Collections.singletonList("\n")), Collections.singletonMap("path2", Arrays.asList(""))), configuration.getAllComments());
    }

}