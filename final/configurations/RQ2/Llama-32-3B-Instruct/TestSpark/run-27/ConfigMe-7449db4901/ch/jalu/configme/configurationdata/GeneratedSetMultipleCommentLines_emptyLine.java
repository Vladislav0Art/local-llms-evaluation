package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetMultipleCommentLines_emptyLine {

    @Mock
    private SettingsHolder settingsHolder;

    @Test
    public void setMultipleCommentLines_emptyLine() {
        CommentsConfiguration comments = new CommentsConfiguration();
        Map<String, List<String>> map = new HashMap<>();
        comments.setComment("path", "comment1\n");
        Map<String, List<String>> resultMap = comments.getAllComments();
        assertEquals(2, resultMap.size());
    }

}