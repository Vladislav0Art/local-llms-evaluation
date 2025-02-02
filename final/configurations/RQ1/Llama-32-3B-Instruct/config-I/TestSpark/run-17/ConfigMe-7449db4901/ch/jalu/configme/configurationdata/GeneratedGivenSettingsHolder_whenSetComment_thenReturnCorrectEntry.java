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
public class GeneratedGivenSettingsHolder_whenSetComment_thenReturnCorrectEntry {

    private SettingsHolder settingsHolder = Mockito.mock(SettingsHolder.class);

    @Mock
    private Map<String, List<String>> commentsMap;

    @Before
    public void setup() {
        when(settingsHolder.registerComments(Mockito.anyString(), Mockito.anyString())).thenReturn("");
    }

    @Test
    public void givenSettingsHolder_whenSetComment_thenReturnCorrectEntry() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(settingsHolder);
        commentsConfiguration.setComment("newLine");
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertEquals(1, allComments.size());
    }

}