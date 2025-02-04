package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedGetAllCommentsReturnsEmptyMapForUnregisteredPath {

    @Test
    public void getAllCommentsReturnsEmptyMapForUnregisteredPath() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        Map<String, List<String>> result = commentsConfiguration.getAllComments();
        assertEquals(0, result.size());
    }

}