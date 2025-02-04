package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.anyList;
import static org.mockito.Mockito.anyMap;

public class GeneratedGetAllComments_returnsEmptyMap {

    @Test
    public void getAllComments_returnsEmptyMap() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        assertNull(configuration.getAllComments());
    }

}