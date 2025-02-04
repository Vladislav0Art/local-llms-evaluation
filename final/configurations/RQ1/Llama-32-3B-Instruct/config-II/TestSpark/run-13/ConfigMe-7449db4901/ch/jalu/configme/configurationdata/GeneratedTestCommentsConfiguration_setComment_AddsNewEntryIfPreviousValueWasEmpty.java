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
public class GeneratedTestCommentsConfiguration_setComment_AddsNewEntryIfPreviousValueWasEmpty {

    @Mock
    private Map<String, List<String>> commentsMap;

    @Test
    public void testCommentsConfiguration_setComment_AddsNewEntryIfPreviousValueWasEmpty() {
        List<String> commentLines = new ArrayList<>();
        commentLines.add("\n");
        commentsMap.put("oldPath", commentLines);
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(commentsMap);
        String newLine = "newLine";
        commentsConfiguration.setComment("oldPath", newLine, "\n");
        assertNotNull(commentsConfiguration.comments.get("oldPath"));
    }

}