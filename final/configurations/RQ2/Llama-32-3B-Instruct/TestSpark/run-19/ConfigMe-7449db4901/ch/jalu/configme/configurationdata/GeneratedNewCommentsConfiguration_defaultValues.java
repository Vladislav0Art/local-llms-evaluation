package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedNewCommentsConfiguration_defaultValues {

    @Test
    public void newCommentsConfiguration_defaultValues() {
        CommentsConfiguration config = new CommentsConfiguration();
        assertEquals(Collections.emptyMap(), config.getAllComments());
    }

}