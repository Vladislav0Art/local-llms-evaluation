package ch.jalu.configme.configurationdata;

public class GeneratedTestCreate_EmptyList {

    @Mock
    private List<Property<?>> mockPropertyList;

    @Mock
    private Map<String, Object> mockRootEntries;

    @Test
    public void testCreate_EmptyList() {
        when(mockPropertyList.isEmpty()).thenReturn(true);
        assertEquals(new ArrayList<>(), PropertyListBuilder.create(mockPropertyList));
    }

}