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

public class GeneratedGivenExistingAndNewPaths_whenSettingComment_thenShouldNotModifyExistingPaths {

    @Mock
    private SettingsHolder settingsHolderMock;

    public void setSettingsHolder(SettingsHolder settingsHolder) {
        this.settingsHolderMock = settingsHolder;
    }

    @Test
    public void givenExistingAndNewPaths_whenSettingComment_thenShouldNotModifyExistingPaths() {
        String path1 = "path1";
        String path2 = "newPath";
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(settingsHolderMock);
        Map<String, List<String>> existingComments = new HashMap<>();
        existingComments.put(path1, Collections.singletonList(""));
        Map<String, List<String>> newComments = new HashMap<>();
        newComments.put(path2, Collections.singletonList("comment"));
        commentsConfiguration.setComment(path1, "");
        commentsConfiguration.setComment(path2, "comment");
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertThat(allComments.get(path1), equalTo(existingComments));
        assertThat(allComments.get(path2), equalTo(newComments));
    }
}

public class CommentsConfiguration {
    private final SettingsHolder settingsHolder;

    public CommentsConfiguration(SettingsHolder settingsHolder) {
        this.settingsHolder = settingsHolder;
    }

    public Map<String, List<String>> getAllComments() {
        return new HashMap<>();
    }

    public void setComment(String path, String... commentLines) {
    }

}