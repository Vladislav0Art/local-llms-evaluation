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
public class GeneratedSetComment_setsCommentForPath {

    @Mock
    private SettingsHolder settingsHolderMock;

    @Test
    public void setComment_setsCommentForPath() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        Map<String, List<String>> commentMap = new HashMap<>();
        commentMap.put("path1", Arrays.asList("commentLine1"));
        when(settingsHolderMock.getComments()).thenReturn(commentMap);
        String path = "path1";
        String[] commentLines = {"newCommentLine"};
        commentsConfiguration.setComment(path, commentLines);
        assertThat(commentsConfiguration.getAllComments(), equalMap(commentMap, path, Arrays.asList("newCommentLine")));
    }

}