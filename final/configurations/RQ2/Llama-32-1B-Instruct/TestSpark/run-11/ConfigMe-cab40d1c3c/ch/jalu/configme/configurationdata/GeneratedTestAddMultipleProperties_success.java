package ch.jalu.configme.configurationdata;

public class GeneratedTestAddMultipleProperties_success {

    private PropertyListBuilder subject;

    @Before
    public void setup() {
    }

    @Test
    public void testAddMultipleProperties_success() {
        List<Property<?>> properties = new ArrayList<>();
        properties.add(new Property("key1", "value1"));
        properties.add(new Property("key2", "value2"));
        subject.add(properties.get(0));
        assertEquals(2, subject.create().size());
    }

}