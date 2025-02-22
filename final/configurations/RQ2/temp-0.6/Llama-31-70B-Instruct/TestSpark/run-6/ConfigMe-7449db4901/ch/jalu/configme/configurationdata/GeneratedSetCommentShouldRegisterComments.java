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

public class GeneratedSetCommentShouldRegisterComments {

    @Test
    public void setCommentShouldRegisterComments() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("testpath", "testline1", "testline2");
        assertEquals(commentsConfiguration.getAllComments().get("testpath").get(0), "testline1");
        assertEquals(commentsConfiguration.getAllComments().get("testpath").get(1), "testline2");
    }

}