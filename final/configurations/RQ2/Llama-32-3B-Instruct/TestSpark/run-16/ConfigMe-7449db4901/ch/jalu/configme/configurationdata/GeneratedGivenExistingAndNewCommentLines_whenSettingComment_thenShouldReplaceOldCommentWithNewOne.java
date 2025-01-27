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

public class GeneratedGivenExistingAndNewCommentLines_whenSettingComment_thenShouldReplaceOldCommentWithNewOne {

    @Mock
    private SettingsHolder settingsHolderMock;

    public void setSettingsHolder(SettingsHolder settingsHolder) {
        this.settingsHolderMock = settingsHolder;
    }

    @Test
    public void givenExistingAndNewCommentLines_whenSettingComment_thenShouldReplaceOldCommentWithNewOne() {
        String path = "path";
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        Map<String, List<String>> existingComments = new HashMap<>();
        existingComments.put(path, Collections.singletonList("comment1"));
        commentsConfiguration.setComment(path, "comment1", "comment2");
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertThat(allComments.get(path), containsInAnyOrder("comment1", "comment2"));
    }

}