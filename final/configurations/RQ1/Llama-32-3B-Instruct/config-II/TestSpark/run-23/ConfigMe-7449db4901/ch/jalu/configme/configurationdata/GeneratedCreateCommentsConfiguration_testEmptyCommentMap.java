package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;

public class GeneratedCreateCommentsConfiguration_testEmptyCommentMap {

    @Test
    public void createCommentsConfiguration_testEmptyCommentMap() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();

        assertNotNull(commentsConfig.comments);
    }

}