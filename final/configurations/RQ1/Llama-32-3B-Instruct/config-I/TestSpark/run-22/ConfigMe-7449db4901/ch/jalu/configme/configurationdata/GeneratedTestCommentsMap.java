package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestCommentsMap {

    public Map<String, List<String>> getAllComments() {
        return new HashMap<>();
    }
}

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private List<String> commentsList;

    @Mock
    private Map<String, List<String>> commentsMap;

    @Test
    public void testCommentsMap() {
        // setup mock objects and calls on them
        commentsMap = new HashMap<>();
        commentsMap.put("key1", new ArrayList<>());
        when(commentsMap.get("key1")).thenReturn(new ArrayList<>());

        // check if the map was created with the correct values
        assertThat(commentsMap, equalTo(mock(Map.class)));
    }

}