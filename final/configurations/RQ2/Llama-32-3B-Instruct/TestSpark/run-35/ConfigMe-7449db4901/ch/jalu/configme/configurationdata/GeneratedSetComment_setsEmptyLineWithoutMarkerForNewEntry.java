package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetComment_setsEmptyLineWithoutMarkerForNewEntry {

    @Mock
    private SettingsHolder settingsHolderMock;

    @InjectMocks
    private CommentsConfiguration commentsConfiguration;

    @Test
    public void setComment_setsEmptyLineWithoutMarkerForNewEntry() {
        when(settingsHolderMock.getComments()).thenReturn(new HashMap<>());
        String path = "path";
        List<String> commentLines = new ArrayList<>();
        commentLines.add("");
        commentsConfiguration.setComment(path, commentLines.toArray(new String[0]));
        assertEquals(Collections.singletonList(""), commentsConfiguration.getAllComments().get(path));
    }

}