package ch.jalu.configme.configurationdata;

public class GeneratedAdd_property {

    private PropertyListBuilder subject;

    @BeforeEach
    public void setup() {
        subject = new PropertyListBuilder();
    }

    @Test
    public void add_property() {
        subject.add(Property.of("property1", "value1"));
        assertEquals(1, subject.create().size());
    }

}