package ch.jalu.configme.configurationdata;

import ch.jalu.configme.SettingsHolder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetComment_givenPathAndCommentLines_setsComments {

    @Test
    public void setComment_givenPathAndCommentLines_setsComments() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

        commentsConfiguration.setComment("path1", "comment 1", "comment 2");

        assertThat(commentsConfiguration.getAllComments()).containsKey("path1");
        assertThat(commentsConfiguration.getAllComments().get("path1")).containsExactly("comment 1", "comment 2");
    }

}