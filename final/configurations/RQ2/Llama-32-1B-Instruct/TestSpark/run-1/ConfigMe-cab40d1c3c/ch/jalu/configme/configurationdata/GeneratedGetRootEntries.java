package ch.jalu.configme.configurationdata;

public class GeneratedGetRootEntries {

    private PropertyListBuilder subject;

    @BeforeEach
    public void setup() {
        subject = new PropertyListBuilder();
    }

    @Test
    public void getRootEntries() {
        List<Property<?>> properties = new ArrayList<>();
        properties.add(Property.of("property1", "value1"));
        properties.add(Property.of("property2", "value2"));

        Map<String, Object> map = subject.getRootEntries();
        assertEquals(2, map.size());
        assertTrue(map.get("property1") instanceof Property);
        assertTrue(map.get("property2") instanceof Property);
    }

}