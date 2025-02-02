package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetAllComments_testContainsPathComments {

    @Mock
    private SettingsHolder settingsHolder;

    @Mock
    private Map<String, List<String>> commentsMap;

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void getAllComments_testContainsPathComments() {
        commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path", "line1");
        Map<String, List<String>> map = commentsConfiguration.getAllComments();
        assertEquals(1, map.size());
        assertTrue(map.containsKey("path"));
        assertEquals(1, ((List<String>) map.get("path")).size());
    }

}