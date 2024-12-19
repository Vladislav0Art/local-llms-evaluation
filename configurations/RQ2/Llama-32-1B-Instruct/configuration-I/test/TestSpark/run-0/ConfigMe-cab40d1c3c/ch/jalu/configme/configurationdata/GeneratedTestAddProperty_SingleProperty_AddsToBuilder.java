package ch.jalu.configme.configurationdata;

public class GeneratedTestAddProperty_SingleProperty_AddsToBuilder {

    private Map<String, Object> mockRootEntries;

    @Before
    public void setup() {
        this.mockRootEntries = Mockito.mock(Map.class);
        Mockito.when(this.propertyListBuilder.getRootEntries()).thenReturn(mockRootEntries);
    }

    @Test
    public void testAddProperty_SingleProperty_AddsToBuilder() {
        Property<?> property = new StringProperty("key", "value");
        addProperty("key", property);
        verify(this.propertyListBuilder, times(1)).add(property);
    }

}