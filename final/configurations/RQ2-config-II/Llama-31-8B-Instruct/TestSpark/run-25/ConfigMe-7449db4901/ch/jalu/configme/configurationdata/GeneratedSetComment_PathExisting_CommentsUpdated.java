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
public class GeneratedSetComment_PathExisting_CommentsUpdated {

    @InjectMocks
    private CommentsConfiguration commentsConfiguration;

    @Test
    public void setComment_PathExisting_CommentsUpdated() {
        commentsConfiguration.setComment("path", "line1", "line2");
        commentsConfiguration.setComment("path", "newLine1", "newLine2");
        Map<String, List<String>> comments = commentsConfiguration.getAllComments();
        assertEquals(1, comments.size());
        assertEquals(Arrays.asList("newLine1", "newLine2"), comments.get("path"));
    }

}