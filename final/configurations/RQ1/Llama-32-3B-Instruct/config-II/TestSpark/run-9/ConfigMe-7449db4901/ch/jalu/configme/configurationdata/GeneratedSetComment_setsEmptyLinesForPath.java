package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ch.jalu.configme.SettingsHolder;
import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.mockito.Mockito;

public class GeneratedSetComment_setsEmptyLinesForPath {

    @Test
    public void setComment_setsEmptyLinesForPath() {
        CommentsConfiguration comments = new CommentsConfiguration();
        String path = "path";
        String commentLine1 = "comment line 1";
        String commentLine2 = "\n"; // empty line
        comments.setComment(path, commentLine1, commentLine2);
        Map<String, List<String>> commentsMap = comments.comments;
        assertThat(commentsMap.get(path).size(), is(0));
    }

}