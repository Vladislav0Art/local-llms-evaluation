package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetAllCommentsReturnsUnmodifiableView {

    @Test
    public void getAllCommentsReturnsUnmodifiableView() {
        var config = new CommentsConfiguration(Collections.emptyMap());
        Map<String, List<String>> comments = config.getAllComments();
        if (comments instanceof UnmodifiableView) {
            ((UnmodifiableView) comments).containsKey("path");
        }
    }

}