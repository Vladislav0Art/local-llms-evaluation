package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetAllCommentsShouldNotChangeOriginalMap {

    @Mock
    private Map<String, List<String>> commentsMap;

    private CommentsConfiguration commentsConfig = new CommentsConfiguration();

    @Test
    public void getAllCommentsShouldNotChangeOriginalMap() {
        Map<String, List<String>> originalComments = new HashMap<>();
        when(commentsMap).thenReturn(originalComments);

        commentsConfig.setComment("path1", "line1");
        commentsConfig.setComment("path2", "line2");

        assertNotNull(commentsConfig.getAllComments());
        assertEquals(originalComments, commentsConfig.getAllComments());
    }

}