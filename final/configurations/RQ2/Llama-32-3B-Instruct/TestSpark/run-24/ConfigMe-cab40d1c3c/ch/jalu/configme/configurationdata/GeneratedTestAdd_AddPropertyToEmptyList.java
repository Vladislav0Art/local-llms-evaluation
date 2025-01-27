package ch.jalu.configme.configurationdata;

public class GeneratedTestAdd_AddPropertyToEmptyList {

    @Mock
    private List<Property<?>> mockPropertyList;

    @Mock
    private Map<String, Object> mockRootEntries;

    @Test
    public void testAdd_AddPropertyToEmptyList() {
        when(mockPropertyList.isEmpty()).thenReturn(false);
        PropertyListBuilder instance = new PropertyListBuilder();
        instance.add(Mockito.mock(Property.class));
        List<Property<?>> result = instance.create();
        assertNotNull(result);
        assertTrue(result.contains(Mockito.mock(Property.class)));
    }

}