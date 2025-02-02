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
public class GeneratedGetAllComments_testContainsEmptyLineWithoutMarker {

    @Mock
    private SettingsHolder settingsHolder;

    @Mock
    private Map<String, List<String>> commentsMap;

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void getAllComments_testContainsEmptyLineWithoutMarker() {
        commentsConfiguration = new CommentsConfiguration();
        Map<String, List<String>> map = commentsConfiguration.getAllComments();
        assertEquals(0, map.size());
    }

}