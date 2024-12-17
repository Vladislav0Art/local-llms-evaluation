package ch.jalu.configme.configurationdata;

public class GeneratedTest {

    private Map<String, List<String>> map;

    public CommentsConfiguration(Map<String, List<String>> map) {
        this.map = map;
    }

    public void setComment(String path, String comment, String marker) {
        if (marker.isEmpty()) {
            map.get(path).add(comment);
        } else {
            map.putIfAbsent(path, new ArrayList<>());
            ((List<String>) map.get(path)).add(comment);
        }
    }

    public List<String> getAllComments() {
        return map;
    }
}

public class CommentsConfigurationTest {

}