package ch.jalu.configme.configurationdata;

public class GeneratedCreate {

    private PropertyListBuilder subject;

    @BeforeEach
    public void setup() {
        subject = new PropertyListBuilder();
    }

    @Test
    public void create() {
        List<Property<?>> properties = new ArrayList<>();
        properties.add(Property.of("property1", "value1"));
        properties.add(Property.of("property2", "value2"));

        subject.add(property -> property.setValue("newValue"));
        assertEquals(2, subject.create().size());
    }

}