package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.SettingsHolder;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GeneratedGetAllCommentsShouldReturnReadOnlyView {

    @Test
    public void getAllCommentsShouldReturnReadOnlyView() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("testpath", "testline1", "testline2");
        Map<String, List<String>> comments = commentsConfiguration.getAllComments();
        comments.clear();
        assertEquals(1, commentsConfiguration.getAllComments().size());
    }

}