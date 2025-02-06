package ch.jalu.configme.configurationdata;

import ch.jalu.configme.SettingsHolder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.UnmodifiableView;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.UUID;

public class GeneratedTestSamePathWithMultipleCommentLines {

    @Test
    public void testSamePathWithMultipleCommentLines() {
        Map<String, List<String>> comments = new HashMap<>();
        var config = new CommentsConfiguration(comments);
        config.setComment("test", "# comment1\n# comment2");
        assertTrue(Arrays.equals(config.getAllComments().get("test"), Arrays.asList("# comment1", "# comment2")));
    }

}