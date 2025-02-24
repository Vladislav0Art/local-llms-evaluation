package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import ch.jalu.configme.SettingsHolder;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private SettingsHolder settingsHolder;

    @Test
    public void setCommentWithoutTrailingSpacesTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("test", "test comment");
        assertEquals(1, commentsConfiguration.getAllComments().size());
    }

    @Test
    public void setCommentWithTrailingSpacesTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("test", "test comment ");
        assertEquals(1, commentsConfiguration.getAllComments().size());
    }

    @Test
    public void setCommentWithMultipleCommentsTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("test", "test comment", "test comment 2");
        assertEquals(1, commentsConfiguration.getAllComments().size());
    }

    @Test
    public void setCommentWithEmptyCommentsTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("test", "");
        assertEquals(1, commentsConfiguration.getAllComments().size());
    }

    @Test
    public void setCommentWithNullCommentsTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("test", (String[]) null);
        assertEquals(1, commentsConfiguration.getAllComments().size());
    }

}