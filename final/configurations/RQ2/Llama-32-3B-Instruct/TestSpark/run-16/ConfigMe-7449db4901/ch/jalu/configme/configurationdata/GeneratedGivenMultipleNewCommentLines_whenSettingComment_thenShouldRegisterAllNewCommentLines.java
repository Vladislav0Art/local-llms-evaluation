package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGivenMultipleNewCommentLines_whenSettingComment_thenShouldRegisterAllNewCommentLines {

    @Mock
    private SettingsHolder settingsHolderMock;

    public void setSettingsHolder(SettingsHolder settingsHolder) {
        this.settingsHolderMock = settingsHolder;
    }

    @Test
    public void givenMultipleNewCommentLines_whenSettingComment_thenShouldRegisterAllNewCommentLines() {
        String path = "path";
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(settingsHolderMock);
        Map<String, List<String>> existingComments = new HashMap<>();
        commentsConfiguration.setComment(path, "comment1", "comment2");
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertThat(allComments.get(path), containsInAnyOrder("comment1", "comment2"));
    }

}