package ch.jalu.configme.configurationdata;

import ch.jalu.configme.SettingsHolder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetComment_Path_EmptyCommentLines_EmptyList {

    @InjectMocks
    private CommentsConfiguration commentsConfiguration;

    @Test
    public void setComment_Path_EmptyCommentLines_EmptyList() {
        String path = "path";
        commentsConfiguration.setComment(path, new String[0]);
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertEquals(1, allComments.size());
        assertEquals(Collections.emptyList(), allComments.get(path));
    }

}