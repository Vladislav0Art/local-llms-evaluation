package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.anyList;
import static org.mockito.Mockito.anyMap;

public class GeneratedOfNewInstance_hasEmptyComments {

    @Test
    public void ofNewInstance_hasEmptyComments() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        assertEquals(0, configuration.comments.size());
    }

}