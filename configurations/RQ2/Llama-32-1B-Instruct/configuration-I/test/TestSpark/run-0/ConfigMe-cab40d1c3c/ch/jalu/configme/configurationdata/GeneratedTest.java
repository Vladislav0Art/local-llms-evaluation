package ch.jalu.configme.configurationdata;

public class GeneratedTest {

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

    @Test
    public void testCreateProperties_ReturnsProperties() {
        List<Property<?>> properties = createProperties(new String[]{"key"});
        assertEquals(1, properties.size());
        verify(this.propertyListBuilder, times(1)).create();
        Mockito.verifyNoMoreTimes(this.propertyListBuilder, times(1)).getRootEntries();
    }

    @Test
    public void testGetRootEntries_ReturnsMockedMap() {
        Map<String, Object> expected = new HashMap<>();
        expected.put("key", "value");
        when(this.propertyListBuilder.getRootEntries()).thenReturn(expected);
        assertEquals(expected, getRootEntries());
        verify(mockRootEntries).get("key");
    }

}