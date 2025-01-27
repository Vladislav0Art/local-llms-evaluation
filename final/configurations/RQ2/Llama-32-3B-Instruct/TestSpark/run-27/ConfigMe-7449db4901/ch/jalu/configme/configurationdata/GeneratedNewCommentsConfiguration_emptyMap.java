package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNewCommentsConfiguration_emptyMap {

    @Mock
    private SettingsHolder settingsHolder;

    @Test
    public void newCommentsConfiguration_emptyMap() {
        CommentsConfiguration comments = new CommentsConfiguration();
        Map<String, List<String>> map = comments.getAllComments();
        assertTrue(map.isEmpty());
    }

}