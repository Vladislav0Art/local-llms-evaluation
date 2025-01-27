package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedSetComment_validStringPath {

    @Test
    public void setComment_validStringPath() {
        CommentsConfiguration config = new CommentsConfiguration();
        String[] commentLines = {"comment1", "comment2"};
        when(config.setComment(any(String.class), any(String[].class))).thenReturn(true);
        assertTrue(config.setComment("path", commentLines));
    }

}