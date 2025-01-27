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

public class GeneratedGivenNewCommentsConfiguration_whenConstructingCommentsWithoutArguments_thenShouldReturnEmptyMap {

    @Mock
    private SettingsHolder settingsHolderMock;

    public void setSettingsHolder(SettingsHolder settingsHolder) {
        this.settingsHolderMock = settingsHolder;
    }

    @Test
    public void givenNewCommentsConfiguration_whenConstructingCommentsWithoutArguments_thenShouldReturnEmptyMap() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(settingsHolderMock);
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertThat(allComments.isEmpty(), is(true));
    }

}