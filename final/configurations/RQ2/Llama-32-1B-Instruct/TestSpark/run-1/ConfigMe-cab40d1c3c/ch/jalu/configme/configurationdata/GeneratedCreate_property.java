package ch.jalu.configme.configurationdata;

public class GeneratedCreate_property {

    private PropertyListBuilder subject;

    @BeforeEach
    public void setup() {
        subject = new PropertyListBuilder();
    }

    @Test
    public void create_property() {
        subject.add(property -> property.setValue("value"));
        Property property = subject.createProperty();
        assertTrue(property.getValue() == "value");
    }

}