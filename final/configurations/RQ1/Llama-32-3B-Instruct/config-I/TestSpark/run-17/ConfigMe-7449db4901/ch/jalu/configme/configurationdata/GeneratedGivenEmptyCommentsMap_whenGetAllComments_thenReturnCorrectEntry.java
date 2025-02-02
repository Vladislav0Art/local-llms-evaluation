package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGivenEmptyCommentsMap_whenGetAllComments_thenReturnCorrectEntry {

    private SettingsHolder settingsHolder = Mockito.mock(SettingsHolder.class);

    @Mock
    private Map<String, List<String>> commentsMap;

    @Before
    public void setup() {
        when(settingsHolder.registerComments(Mockito.anyString(), Mockito.anyString())).thenReturn("");
    }

    @Test
    public void givenEmptyCommentsMap_whenGetAllComments_thenReturnCorrectEntry() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertEquals(0, allComments.size());
    }

}

class CommentsConfiguration {

    private final SettingsHolder settingsHolder;
    private final Map<String, List<String>> commentsMap;

    public CommentsConfiguration(SettingsHolder settingsHolder) {
        this.settingsHolder = settingsHolder;
        this.commentsMap = new HashMap<>();
    }

    public void setComment(String comment) {
        // logic to set the comment
    }

    public Map<String, List<String>> getAllComments() {
        return commentsMap;
    }

}