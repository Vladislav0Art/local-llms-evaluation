package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.anyList;
import static org.mockito.Mockito.anyMap;

public class GeneratedSetComment_addsSoloNewLine {

    @Test
    public void setComment_addsSoloNewLine() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        configuration.setComment("path1", "\n");
        assertEquals(0, ((List<String>) configuration.comments.get("path1")).size());
    }

}