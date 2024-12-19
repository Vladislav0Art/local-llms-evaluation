package ch.jalu.configme.configurationdata;

public class GeneratedTestGetRootEntries_ReturnsMockedMap {

    private Map<String, Object> mockRootEntries;

    @Before
    public void setup() {
        this.mockRootEntries = Mockito.mock(Map.class);
        Mockito.when(this.propertyListBuilder.getRootEntries()).thenReturn(mockRootEntries);
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