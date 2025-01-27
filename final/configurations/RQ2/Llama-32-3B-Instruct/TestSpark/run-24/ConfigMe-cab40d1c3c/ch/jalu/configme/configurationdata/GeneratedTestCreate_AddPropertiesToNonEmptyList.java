package ch.jalu.configme.configurationdata;

public class GeneratedTestCreate_AddPropertiesToNonEmptyList {

    @Mock
    private List<Property<?>> mockPropertyList;

    @Mock
    private Map<String, Object> mockRootEntries;

    @Test
    public void testCreate_AddPropertiesToNonEmptyList() {
        when(mockPropertyList.isEmpty()).thenReturn(false);
        PropertyListBuilder instance = new PropertyListBuilder();
        List<Property<?>> properties = new ArrayList<>();
        properties.add(Mockito.mock(Property.class));
        properties.add(Mockito.mock(Property.class));
        instance.add(Mockito.mock(Property.class));
        List<Property<?>> result = instance.create(mockPropertyList);
        assertNotNull(result);
        assertTrue(result.containsAll(properties));
    }

}