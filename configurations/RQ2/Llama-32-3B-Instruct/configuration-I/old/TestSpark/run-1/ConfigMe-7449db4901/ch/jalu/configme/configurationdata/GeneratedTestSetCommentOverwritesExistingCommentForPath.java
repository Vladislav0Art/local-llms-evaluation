package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedTestSetCommentOverwritesExistingCommentForPath {

    @Mock
    private Map<String, List<String>> map;

    public CommentsConfiguration commentsConfiguration(Map<String, List<String>> map) {
        return new CommentsConfiguration(map);
    }

    @Test
    public void testSetCommentOverwritesExistingCommentForPath() throws Exception {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("test", "OldComment1");
        config.setComment("test", "NewComment2");
        assertEquals(2, config.getAllComments().get("test").size());
        assertTrue(config.getAllComments().get("test").containsAll(List.of("NewComment2")));
    }

}