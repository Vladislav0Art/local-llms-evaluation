package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestCommentsConfiguration_getAllComments_ReturnsUnmodifiableView {

    @Mock
    private Map<String, List<String>> commentsMap;

    @Test
    public void testCommentsConfiguration_getAllComments_ReturnsUnmodifiableView() {
        List<String> commentLines = new ArrayList<>();
        commentLines.add("line1");
        commentsMap.put("path", commentLines);
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(commentsMap);
        Map<String, @UnmodifiableView List<String>> allComments = commentsConfiguration.getAllComments();
        assertTrue(allComments instanceof UnmodifiableView);
    }

}