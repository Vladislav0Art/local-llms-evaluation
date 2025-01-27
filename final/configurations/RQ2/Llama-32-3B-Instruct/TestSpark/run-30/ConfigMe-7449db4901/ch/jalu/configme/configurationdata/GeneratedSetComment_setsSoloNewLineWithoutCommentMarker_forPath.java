package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.emptyMap;
import static org.hamcrest.Matchers.equals;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetComment_setsSoloNewLineWithoutCommentMarker_forPath {

    @Mock
    private SettingsHolder settingsHolderMock;

    @Test
    public void setComment_setsSoloNewLineWithoutCommentMarker_forPath() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        Map<String, List<String>> commentMap = new HashMap<>();
        when(settingsHolderMock.getComments()).thenReturn(commentMap);
        String path = "path1";
        String[] commentLines = {"", "", ""};
        commentsConfiguration.setComment(path, commentLines);
        assertThat(commentsConfiguration.getAllComments(), equalMap(commentMap, path, Collections.singletonList("")));
    }

}