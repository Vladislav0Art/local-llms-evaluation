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
public class GeneratedGetAllComments_returnsEmptyMapWhenNoCommentLinesAreSet {

    @Mock
    private SettingsHolder settingsHolderMock;

    @InjectMocks
    private CommentsConfiguration commentsConfiguration;

    @Test
    public void getAllComments_returnsEmptyMapWhenNoCommentLinesAreSet() {
        assertNotNull(commentsConfiguration.getAllComments());
        assertTrue(commentsConfiguration.getAllComments().isEmpty());
    }

}