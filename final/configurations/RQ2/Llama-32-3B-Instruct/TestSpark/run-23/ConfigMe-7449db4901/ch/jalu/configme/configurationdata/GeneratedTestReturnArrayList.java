package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

public class GeneratedTestReturnArrayList {

    @Test
    public void testReturnArrayList() {
        ArrayList<String> comments = new ArrayList<>();
        comments.add("comment1");
        comments.add("comment2");

        ArrayList<String> expectedComments = new ArrayList<>();
        expectedComments.add("comment1");
        expectedComments.add("comment2");

        String actualComments = returnComments(comments);
        assertEquals(expectedComments, actualComments);
    }

    public String returnComments(ArrayList<String> comments) {
        StringBuilder result = new StringBuilder();
        for (String comment : comments) {
            result.append(comment).append(",");
        }
        if (!result.isEmpty()) {
            result.deleteCharAt(result.length() - 1);
        }
        return result.toString();
    }

}