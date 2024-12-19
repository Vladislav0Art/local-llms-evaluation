package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetComment_emptyPath_test {

    @Test
    public void setComment_emptyPath_test() {
        CommentsConfiguration config = new CommentsConfiguration();
        String emptyPath = "";
        String[] commentLines = {};
        config.setComment(emptyPath, commentLines);
        assertNotNull(config.comments.get(emptyPath));
    }

}