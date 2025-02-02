package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedTest {

    private Map<String, List<String>> commentsMap = new HashMap<>();

    public Map<String, List<String>> getComments() {
        return commentsMap;
    }

    public void setComment(String path, String commentLine1, String commentLine2) {
        if (!commentsMap.containsKey(path)) {
            commentsMap.put(path, Arrays.asList(commentLine1, commentLine2));
        } else {
            commentsMap.get(path).add(commentLine2);
        }
    }

    public Map<String, List<String>> getAllComments() {
        return new HashMap<>(commentsMap); // Return a copy to avoid issues
    }
}

public class GeneratedTest {

}