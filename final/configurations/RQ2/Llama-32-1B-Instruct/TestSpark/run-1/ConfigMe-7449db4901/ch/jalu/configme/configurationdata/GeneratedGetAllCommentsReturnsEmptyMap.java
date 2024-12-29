package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.configurationdata.CommentType;
import ch.jalu.configme.configurationdata.ModelCommentData;
import ch.jalu.configme.configurationdata.ParsedModelComment;
import ch.jalu.configme.configurationdata.SettingsHolder;
import org.jetbrains.annotations.NotNull;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedGetAllCommentsReturnsEmptyMap {

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void getAllCommentsReturnsEmptyMap() {
        Mockito.when(commentsConfiguration.getAllComments()).thenReturn(Collections.emptyList());
        Assertions.assertEquals(Collections.emptyList(), commentsConfiguration.getAllComments());
    }

}