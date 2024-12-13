package ch.jalu.configme.configurationdata;

import ch.jalu.configme.SettingsHolder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(Mockito.class)
public class GeneratedGetAllCommentsTest {

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void getAllCommentsTest() {
        commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path", "line1", "line2");
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertEquals(Collections.singletonMap("path", Arrays.asList("line1", "line2")), allComments);
    }

}