package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedSetComment_setsEmptyLineForNewline {

    @Test
    public void setComment_setsEmptyLineForNewline() {
        CommentsConfiguration config = new CommentsConfiguration();
        String path = "path";
        String newline = "\n";
        config.setComment(path, newline);
        assertEquals(Collections.singletonList(newline), config.comments.get(path));
    }

}