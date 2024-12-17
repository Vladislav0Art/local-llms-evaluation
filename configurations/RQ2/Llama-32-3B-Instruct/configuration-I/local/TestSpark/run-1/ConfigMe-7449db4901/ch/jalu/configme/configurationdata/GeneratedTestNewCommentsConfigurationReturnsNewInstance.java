package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedTestNewCommentsConfigurationReturnsNewInstance {

    @Mock
    private Map<String, List<String>> map;

    public CommentsConfiguration commentsConfiguration(Map<String, List<String>> map) {
        return new CommentsConfiguration(map);
    }

    @Test
    public void testNewCommentsConfigurationReturnsNewInstance() throws Exception {
        when(map.get("test")).thenReturn(new ArrayList<>());
        CommentsConfiguration config = commentsConfiguration(map);
        assertNotNull(config);
    }

}