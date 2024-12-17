package ch.jalu.configme.configurationdata;

public class GeneratedTest {

    private CommentsConfiguration testObj;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    public void testGetAllCommentsNoNewlineLines() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path", Collections.singletonList("comment1"));

        when(testObj.getAllComments()).thenReturn(Collections.unmodifiableMap(null));

        assertEquals(Collections.emptySet(), testObj.getAllComments());
    }

    @Test
    public void testGetAllCommentsEmptyPathWithComment() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path", Collections.singletonList("comment1"));

        when(testObj.getAllComments()).thenReturn(Collections.unmodifiableMap(null));

        assertEquals(Collections.emptySet(), testObj.getAllComments());
    }

}