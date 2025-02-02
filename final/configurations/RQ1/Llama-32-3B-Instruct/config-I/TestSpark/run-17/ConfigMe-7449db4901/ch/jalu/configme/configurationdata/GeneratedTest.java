package ch.jalu.configme.configurationdata;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GeneratedTest {

    private List<String> commentsList = new ArrayList<>();

    public void setComment(String comment) {
        this.commentsList.add(comment);
    }

    public Map<String, List<String>> getAllComments() {
        return (Map<String, List<String>>) this.commentsList;
    }
}

class CommentsConfigurationTest {

}