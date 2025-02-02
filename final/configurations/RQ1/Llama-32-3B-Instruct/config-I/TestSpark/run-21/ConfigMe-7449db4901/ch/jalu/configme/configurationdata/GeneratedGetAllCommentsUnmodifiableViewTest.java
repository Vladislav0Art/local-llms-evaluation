package ch.jalu.configme.configurationdata;

import ch.jalu.configme.SettingsHolder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetAllCommentsUnmodifiableViewTest {

    @Mock
    private SettingsHolder settingsHolder;

    private CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

    @Mock
    private Map<String, List<String>> commentsMap;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        commentsMap = new HashMap<>();
    }

    @Test
    public void getAllCommentsUnmodifiableViewTest() {
        Map<String, List<String>> commentMap = new HashMap<>();
        commentMap.put("test/path", Arrays.asList("comment line 1", "comment line 2"));
        commentsConfiguration = new CommentsConfiguration(commentMap);
        assertEquals(commentMap, commentsConfiguration.getAllComments());
    }

}