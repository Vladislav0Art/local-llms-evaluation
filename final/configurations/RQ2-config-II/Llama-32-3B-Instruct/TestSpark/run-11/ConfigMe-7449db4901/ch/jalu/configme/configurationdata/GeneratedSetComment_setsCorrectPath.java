package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetComment_setsCorrectPath {

    @Test
    public void setComment_setsCorrectPath() {
        Map<String, List<String>> map = new HashMap<>();
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path", "comment1");
        assertTrue(commentsConfiguration.getAllComments().containsKey("path"));
    }

}