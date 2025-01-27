package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedNewCommentsConfiguration_emptyMap {

    @Test
    public void newCommentsConfiguration_emptyMap() {
        CommentsConfiguration config = new CommentsConfiguration(new HashMap<>());
        assertEquals(Collections.emptyMap(), config.getAllComments());
    }

}