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
public class GeneratedSetComment_testSetsNewLinesForNonExistingPath {

    @Mock
    private SettingsHolder settingsHolder;

    @Mock
    private Map<String, List<String>> commentsMap;

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void setComment_testSetsNewLinesForNonExistingPath() {
        commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("newPath", "line1", "line2");
        assertNotNull(commentsConfiguration.comments);
        assertEquals(1, commentsConfiguration.comments.size());
        assertTrue(commentsConfiguration.comments.containsKey("newPath"));
    }

}