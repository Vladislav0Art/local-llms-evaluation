package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedNewCommentsConfiguration_isEmpty {

    @Test
    public void newCommentsConfiguration_isEmpty() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        assertEquals(new HashMap<>(), commentsConfiguration.getAllComments());
    }

}