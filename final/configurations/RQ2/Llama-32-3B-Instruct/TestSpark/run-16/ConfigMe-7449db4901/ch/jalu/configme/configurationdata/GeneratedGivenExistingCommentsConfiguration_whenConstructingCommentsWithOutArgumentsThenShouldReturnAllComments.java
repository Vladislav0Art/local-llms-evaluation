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

public class GeneratedGivenExistingCommentsConfiguration_whenConstructingCommentsWithOutArgumentsThenShouldReturnAllComments {

    @Mock
    private SettingsHolder settingsHolderMock;

    public void setSettingsHolder(SettingsHolder settingsHolder) {
        this.settingsHolderMock = settingsHolder;
    }

    @Test
    public void givenExistingCommentsConfiguration_whenConstructingCommentsWithOutArgumentsThenShouldReturnAllComments() {
        Map<String, List<String>> existingComments = new HashMap<>();
        existingComments.put("path1", Arrays.asList("comment1", "comment2"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(existingComments);
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertThat(allComments, equalTo(existingComments));
    }

}