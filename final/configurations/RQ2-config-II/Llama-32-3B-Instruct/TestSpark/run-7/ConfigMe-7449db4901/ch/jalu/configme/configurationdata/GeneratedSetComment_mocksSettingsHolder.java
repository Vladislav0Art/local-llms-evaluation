package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

public class GeneratedSetComment_mocksSettingsHolder {

    @Test
    public void setComment_mocksSettingsHolder() {
        // given
        SettingsHolder settingsHolderMock = mock(SettingsHolder.class);

        when(settingsHolderMock.isInDevelopmentEnvironment()).thenReturn(true);
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path", Arrays.asList("line1"));
        CommentsConfiguration config = new CommentsConfiguration(comments);
        config.setComment("path", "", "commented-line");

        // then
        verify(settingsHolderMock).logCommentedLine("path", "commented-line");
    }

}