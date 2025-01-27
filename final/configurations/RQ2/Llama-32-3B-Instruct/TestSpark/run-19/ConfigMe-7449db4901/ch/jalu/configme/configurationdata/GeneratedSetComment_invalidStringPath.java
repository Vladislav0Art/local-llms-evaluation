package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedSetComment_invalidStringPath {

    @Test
    public void setComment_invalidStringPath() {
        CommentsConfiguration config = new CommentsConfiguration();
        String[] commentLines = {"comment1", "comment2"};
        when(config.setComment(any(String.class), any(String[].class))).thenReturn(true);
        assertFalse(config.setComment("path", commentLines));
    }

}