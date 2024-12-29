package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.configurationdata.CommentType;
import ch.jalu.configme.configurationdata.ModelCommentData;
import ch.jalu.configme.configurationdata.ParsedModelComment;
import ch.jalu.configme.configurationdata.SettingsHolder;
import org.jetbrains.annotations.NotNull;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedGetCommentsReturnsEmptyMap {

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void getCommentsReturnsEmptyMap() {
        Mockito.when(commentsConfiguration.getAllComments().get("path")).thenReturn(Collections.emptyList());
        Assertions.assertEquals(Collections.emptyList(), commentsConfiguration.getAllComments());
    }

}