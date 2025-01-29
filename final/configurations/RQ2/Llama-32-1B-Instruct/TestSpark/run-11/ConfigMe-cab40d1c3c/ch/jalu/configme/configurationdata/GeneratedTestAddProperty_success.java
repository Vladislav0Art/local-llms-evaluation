package ch.jalu.configme.configurationdata;

public class GeneratedTestAddProperty_success {

    private PropertyListBuilder subject;

    @Before
    public void setup() {
    }

    @Test
    public void testAddProperty_success() {
        List<Property<?>> properties = new ArrayList<>();
        properties.add(new Property("key", "value"));
        subject.add(properties.get(0));
        assertEquals(1, subject.create().size());
    }

}