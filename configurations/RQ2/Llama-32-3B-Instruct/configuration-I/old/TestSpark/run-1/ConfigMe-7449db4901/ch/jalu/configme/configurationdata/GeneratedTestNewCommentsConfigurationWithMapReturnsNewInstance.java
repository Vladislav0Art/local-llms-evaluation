package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedTestNewCommentsConfigurationWithMapReturnsNewInstance {

    @Mock
    private Map<String, List<String>> map;

    public CommentsConfiguration commentsConfiguration(Map<String, List<String>> map) {
        return new CommentsConfiguration(map);
    }

    @Test
    public void testNewCommentsConfigurationWithMapReturnsNewInstance() throws Exception {
        when(map.get("test")).thenReturn(Collections.singletonList("Comment1"));
        CommentsConfiguration config = commentsConfiguration(map);
        assertEquals(1, config.getAllComments().get("test").size());
    }

    public List<String> getAllComments(Map<String, List<String>> map) {
        return new ArrayList<>();
    }

}