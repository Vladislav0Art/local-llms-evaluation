package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetAllCommentsReturnsEmptyForNonExistingPath {

    @Mock
    private Map<String, List<String>> commentsMap;

    @Mock
    private String path;

    @Mock
    private String commentLine;

    private CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

    @Test
    public void getAllCommentsReturnsEmptyForNonExistingPath() {
        when(commentsMap.get(anyString())).thenReturn(List.of("old comment"));
        Map<String, List<String>> commentMap = Map.of();
        CommentsConfiguration configuration = new CommentsConfiguration(commentMap);
        assertEquals(0, configuration.getAllComments().size());
        assertTrue(configuration.getAllComments().containsKey(path));
    }

}