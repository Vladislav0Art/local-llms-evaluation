package ch.jalu.configme.configurationdata;

public class GeneratedAdd_property_with_exception {

    private PropertyListBuilder subject;

    @BeforeEach
    public void setup() {
        subject = new PropertyListBuilder();
    }

    @Test
    public void add_property_with_exception() {
        subject.add(Property.of("property1", "value1"));

        try {
            subject.create();
            fail("Expected ConfigMeException");
        } catch (ConfigMeException e) {
        }
    }

    private Property createProperty() {
        return Property.of("property3", "value3");
    }

}