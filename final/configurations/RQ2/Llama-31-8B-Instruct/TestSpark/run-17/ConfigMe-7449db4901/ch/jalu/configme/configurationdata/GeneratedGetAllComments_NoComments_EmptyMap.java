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
public class GeneratedGetAllComments_NoComments_EmptyMap {

    @InjectMocks
    private CommentsConfiguration commentsConfiguration;

    @Test
    public void getAllComments_NoComments_EmptyMap() {
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertEquals(0, allComments.size());
    }

}