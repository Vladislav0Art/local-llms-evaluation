package ch.jalu.configme.configurationdata;

import ch.jalu.configme.SettingsHolder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNewCommentsConfigurationIsPopulatedFromMap {

    @Mock
    private SettingsHolder settingsHolder;

    @Test
    public void newCommentsConfigurationIsPopulatedFromMap() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("path1", Arrays.asList("comment1"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(map);
        assertEquals(map, commentsConfiguration.getAllComments());
    }

}