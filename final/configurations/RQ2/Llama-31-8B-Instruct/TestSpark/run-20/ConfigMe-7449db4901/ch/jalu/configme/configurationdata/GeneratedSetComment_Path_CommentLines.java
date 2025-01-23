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
public class GeneratedSetComment_Path_CommentLines {

    @InjectMocks
    private CommentsConfiguration commentsConfiguration;

    @Test
    public void setComment_Path_CommentLines() {
        String path = "path";
        String[] commentLines = {"line1", "line2"};
        commentsConfiguration.setComment(path, commentLines);
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertEquals(1, allComments.size());
        assertEquals(Arrays.asList("line1", "line2"), allComments.get(path));
    }

}