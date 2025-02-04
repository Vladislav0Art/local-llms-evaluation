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
public class GeneratedTestCommentsConfiguration_setComment_AddsNewEntryIfNotExistsAndHasPreviousValues {

    @Mock
    private Map<String, List<String>> commentsMap;

    @Test
    public void testCommentsConfiguration_setComment_AddsNewEntryIfNotExistsAndHasPreviousValues() {
        List<String> commentLines = new ArrayList<>();
        commentLines.add("line1");
        commentsMap.put("oldPath", commentLines);
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(commentsMap);
        commentsConfiguration.setComment("newPath", "line2");
        assertNotNull(commentsConfiguration.comments.get("newPath"));
    }

}