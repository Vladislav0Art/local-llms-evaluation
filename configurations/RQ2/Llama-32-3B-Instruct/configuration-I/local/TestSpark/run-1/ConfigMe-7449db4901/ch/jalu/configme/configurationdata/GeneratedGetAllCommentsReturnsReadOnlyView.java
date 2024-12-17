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
public class GeneratedGetAllCommentsReturnsReadOnlyView {

    @Mock
    private Map<String, List<String>> map;

    public CommentsConfiguration commentsConfiguration(Map<String, List<String>> map) {
        return new CommentsConfiguration(map);
    }

    @Test
    public void getAllCommentsReturnsReadOnlyView() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("test", "Comment1");
        config.setComment("test2", "Comment2");
        assertTrue(config.getAllComments().containsKey("test"));
        assertTrue(config.getAllComments().containsKey("test2"));
    }

}