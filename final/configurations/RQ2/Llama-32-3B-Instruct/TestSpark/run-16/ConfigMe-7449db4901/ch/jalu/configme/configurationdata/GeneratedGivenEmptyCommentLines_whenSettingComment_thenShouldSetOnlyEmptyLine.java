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

public class GeneratedGivenEmptyCommentLines_whenSettingComment_thenShouldSetOnlyEmptyLine {

    @Mock
    private SettingsHolder settingsHolderMock;

    public void setSettingsHolder(SettingsHolder settingsHolder) {
        this.settingsHolderMock = settingsHolder;
    }

    @Test
    public void givenEmptyCommentLines_whenSettingComment_thenShouldSetOnlyEmptyLine() {
        String path = "path";
        String[] commentLines = {};
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(settingsHolderMock);
        commentsConfiguration.setComment(path, commentLines);
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertThat(allComments.get(path), containsInAnyOrder("", ""));
    }

}