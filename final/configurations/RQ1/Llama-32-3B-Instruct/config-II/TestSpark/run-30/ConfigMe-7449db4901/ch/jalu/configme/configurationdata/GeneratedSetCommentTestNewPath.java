package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.List;

public class GeneratedSetCommentTestNewPath {

    @Test
    public void setCommentTestNewPath() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        String path = "path";
        String[] commentLines = {"#line1"};
        configuration.setComment(path, commentLines);
        assertNull(configuration.comments.get("new_path"));
    }

}