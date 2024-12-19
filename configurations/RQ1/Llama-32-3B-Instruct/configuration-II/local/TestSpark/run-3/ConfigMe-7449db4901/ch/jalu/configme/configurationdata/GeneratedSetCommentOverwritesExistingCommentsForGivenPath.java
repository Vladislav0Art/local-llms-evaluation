package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetCommentOverwritesExistingCommentsForGivenPath {

    @Mock
    private SettingsHolder settingsHolderMock;

    public List<String> getMockComments() {
        return new ArrayList<>();
    }

    @Test
    public void setCommentOverwritesExistingCommentsForGivenPath() {
        CommentsConfiguration comments = new CommentsConfiguration();
        List<String> commentLines1 = new ArrayList<>();
        commentLines1.add("Line 1");
        commentLines1.add("Line 2");
        comments.setComment("path", commentLines1.get(0), commentLines1.get(1));
        List<String> commentLines2 = new ArrayList<>();
        commentLines2.add("Line 3");
        commentLines2.add("Line 4");
        comments.setComment("path", commentLines2.get(0), commentLines2.get(1));
        assertEquals(commentLines2, comments.getComments().get("path"));
    }

}