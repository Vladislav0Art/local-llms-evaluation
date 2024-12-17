package ch.jalu.configme.configurationdata;

public class GeneratedGetAllComments_isUnmodifiableView {

    @Mock
    private Map<String, List<String>> commentsMap;

    public static void main(String[] args) {
        CommentsConfigurationTest test = new CommentsConfigurationTest();
    }

    @Test
    public void getAllComments_isUnmodifiableView() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("path", new ArrayList<>());
        when(commentsMap).thenReturn(map);
        assertTrue(!commentsConfiguration.getAllComments().containsValue(null));
    }

}