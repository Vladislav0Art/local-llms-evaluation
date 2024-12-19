package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedTestGetAllCommentsReturnsReadOnlyView {

    @Mock
    private Map<String, List<String>> map;

    public CommentsConfiguration commentsConfiguration(Map<String, List<String>> map) {
        return new CommentsConfiguration(map);
    }

    @Test
    public void testGetAllCommentsReturnsReadOnlyView() throws Exception {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("test", "Comment1");
        config.setComment("test2", "Comment2");
        assertTrue(config.getAllComments().containsKey("test"));
        assertTrue(config.getAllComments().containsKey("test2"));
    }

}