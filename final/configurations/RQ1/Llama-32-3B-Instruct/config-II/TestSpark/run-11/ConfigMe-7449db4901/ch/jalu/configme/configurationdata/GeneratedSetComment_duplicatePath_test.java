package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.HashMap;
import java.util.Collections;

public class GeneratedSetComment_duplicatePath_test {

    @Test
    public void setComment_duplicatePath_test() {
        CommentsConfiguration config = new CommentsConfiguration();
        String comment1 = "Comment 1";
        String comment2 = "Comment 2";
        config.setComment("path", comment1, comment2);
        config.setComment("path", "", "");
        assertEquals(1, config.comments.size());
    }

}