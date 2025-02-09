package ch.jalu.configme.configurationdata;

import org.junit.Test;
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
public class GeneratedSetComment_setsCorrectValueInCommentsMap {

    @Mock
    private SettingsHolder settingsHolderMock;

    @InjectMocks
    private CommentsConfiguration commentsConfiguration;

    @Test
    public void setComment_setsCorrectValueInCommentsMap() {
        when(settingsHolderMock.getComments()).thenReturn(new HashMap<>());
        String path = "path";
        List<String> commentLines = new ArrayList<>();
        commentLines.add("line1");
        commentsConfiguration.getAllComments().put(path, commentLines);
        assertEquals(commentLines, commentsConfiguration.getAllComments().get(path));
    }

}