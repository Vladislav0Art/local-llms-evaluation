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

public class GeneratedSetComment_setsMultipleLinesForPath {

    @Test
    public void setComment_setsMultipleLinesForPath() {
        CommentsConfiguration comments = new CommentsConfiguration();
        String path = "path";
        String commentLine1 = "comment line 1";
        String commentLine2 = "comment line 2";
        comments.setComment(path, commentLine1, commentLine2);
        Map<String, List<String>> commentsMap = comments.comments;
        assertThat(commentsMap.get(path).size(), is(2));
    }

}