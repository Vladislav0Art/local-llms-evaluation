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
public class GeneratedSetComment_testSetsEmptyLineWithoutMarker {

    @Mock
    private SettingsHolder settingsHolder;

    @Mock
    private Map<String, List<String>> commentsMap;

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void setComment_testSetsEmptyLineWithoutMarker() {
        commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path", "", "\n");
        assertEquals(1, commentsConfiguration.comments.get("path").size());
    }

}