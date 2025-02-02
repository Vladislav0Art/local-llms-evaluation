package ch.jalu.configme.configurationdata;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetComment_ForExistingPath_OverwritesOldComments {

    @Test
    public void setComment_ForExistingPath_OverwritesOldComments() {
        CommentsConfiguration comments = new CommentsConfiguration();
        String commentLines[] = {"line1", "line2"};
        Map<String, List<String>> result = comments.setComment("path", commentLines);
        String oldCommentLines[] = {"oldLine1", "oldLine2"};
        CommentsConfiguration comments2 = new CommentsConfiguration();
        String commentLines2[] = {"newLine1", "newLine2"};
        Map<String, List<String>> result2 = comments2.setComment("path", commentLines2);
        assertThat(result.get("path"), is(Arrays.asList(commentLines)));
    }

}