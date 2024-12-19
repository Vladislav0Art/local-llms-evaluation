package ch.jalu.configme.configurationdata;

public class GeneratedTestCreateProperties_ReturnsProperties {

    private Map<String, Object> mockRootEntries;

    @Before
    public void setup() {
        this.mockRootEntries = Mockito.mock(Map.class);
        Mockito.when(this.propertyListBuilder.getRootEntries()).thenReturn(mockRootEntries);
    }

    @Test
    public void testCreateProperties_ReturnsProperties() {
        List<Property<?>> properties = createProperties(new String[]{"key"});
        assertEquals(1, properties.size());
        verify(this.propertyListBuilder, times(1)).create();
        Mockito.verifyNoMoreTimes(this.propertyListBuilder, times(1)).getRootEntries();
    }

}