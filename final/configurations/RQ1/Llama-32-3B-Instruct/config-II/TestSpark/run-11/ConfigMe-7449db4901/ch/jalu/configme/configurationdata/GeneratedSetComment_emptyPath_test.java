package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.HashMap;
import java.util.Collections;

public class GeneratedSetComment_emptyPath_test {

    @Test
    public void setComment_emptyPath_test() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("", "", "New comment");
        assertNull(config.comments.get(""));
    }

}