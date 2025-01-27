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
public class GeneratedSetMultipleCommentLines_emptyPath {

    @Mock
    private SettingsHolder settingsHolder;

    @Test
    public void setMultipleCommentLines_emptyPath() {
        CommentsConfiguration comments = new CommentsConfiguration();
        Map<String, List<String>> map = new HashMap<>();
        comments.setComment("", "comment1\n");
        Map<String, List<String>> resultMap = comments.getAllComments();
        assertTrue(resultMap.isEmpty());
    }

}