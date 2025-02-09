package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentThrowsForNullPathOrLinesArray {

    @Test
    public void setCommentThrowsForNullPathOrLinesArray() {
        var config = new CommentsConfiguration();
        config.setComment(null, null);
    }

}