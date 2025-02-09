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
public class GeneratedGetAllComments_containsCommentLinesForAllPaths {

    @Mock
    private SettingsHolder settingsHolderMock;

    @InjectMocks
    private CommentsConfiguration commentsConfiguration;

    @Test
    public void getAllComments_containsCommentLinesForAllPaths() {
        when(settingsHolderMock.getComments()).thenReturn(Map.of("path1", List.of("line1"), "path2", List.of("line2")));
        String path = "path3";
        List<String> commentLines = new ArrayList<>();
        commentsConfiguration.setComment(path, commentLines.toArray(new String[0]));
        assertEquals(Map.of("path1", Arrays.asList("line1"), "path2", Arrays.asList("line2"), "path3", Collections.singletonList("")), commentsConfiguration.getAllComments());
    }

}