package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Collections;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetCommentOverwritesExistingCommentForPath {

    @Mock
    private Map<String, List<String>> map;

    public CommentsConfiguration commentsConfiguration(Map<String, List<String>> map) {
        return new CommentsConfiguration(map);
    }

    @Test
    public void setCommentOverwritesExistingCommentForPath() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("test", "OldComment1");
        config.setComment("test", "NewComment2");
        assertEquals(2, config.getAllComments().get("test").size());
        assertTrue(config.getAllComments().get("test").containsAll(List.of("NewComment2")));
    }

}