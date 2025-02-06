package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedNewInstanceIsUnmodifiableView {

    @Test
    public void newInstanceIsUnmodifiableView() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        Map<String, List<String>> comments = configuration.getAllComments();
        for (Map.Entry<String, List<String>> entry : comments.entrySet()) {
            try {
                entriesUnmodified();
            } catch (Exception e) {
                assert false;
            }
        }
    }

}