package ch.jalu.configme.configurationdata;

public class GeneratedTestCreate_AddPropertiesToRootEntries {

    @Mock
    private List<Property<?>> mockPropertyList;

    @Mock
    private Map<String, Object> mockRootEntries;

    @Test
    public void testCreate_AddPropertiesToRootEntries() {
        when(mockPropertyList.isEmpty()).thenReturn(false);
        PropertyListBuilder instance = new PropertyListBuilder();
        instance.add(Mockito.mock(Property.class));
        instance.add(Mockito.mock(Property.class));
        List<Property<?>> result = instance.create(mockRootEntries);
        assertNotNull(result);
    }

    public static class PropertyListBuilder {
        private final List<Property<?>> properties;

        public PropertyListBuilder() {
            this.properties = new ArrayList<>();
        }

        public void add(Property<?> property) {
            properties.add(property);
        }

        public List<Property<?>> create() {
            return properties;
        }
    }

}