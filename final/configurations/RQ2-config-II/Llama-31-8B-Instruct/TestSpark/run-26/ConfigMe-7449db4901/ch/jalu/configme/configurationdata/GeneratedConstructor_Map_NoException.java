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
public class GeneratedConstructor_Map_NoException {

    @InjectMocks
    private CommentsConfiguration commentsConfiguration;

    @Test
    public void constructor_Map_NoException() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path", Arrays.asList("line1", "line2"));
        commentsConfiguration = new CommentsConfiguration(comments);
        assertNotNull(commentsConfiguration);
    }

}