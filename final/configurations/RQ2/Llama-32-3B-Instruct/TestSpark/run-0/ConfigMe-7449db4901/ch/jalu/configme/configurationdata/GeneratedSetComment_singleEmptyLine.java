package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedSetComment_singleEmptyLine {

    @Test
    public void setComment_singleEmptyLine() {
        Map<String, List<String>> comments = Collections.emptyMap();
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        config.setComment("path", "");
        assertEquals(Collections.singletonMap("path", Arrays.asList("")), configuration.getAllComments());
    }

}