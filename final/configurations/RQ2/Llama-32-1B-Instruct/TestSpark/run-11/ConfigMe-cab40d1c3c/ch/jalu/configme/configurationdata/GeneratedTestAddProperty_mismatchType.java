package ch.jalu.configme.configurationdata;

public class GeneratedTestAddProperty_mismatchType {

    private PropertyListBuilder subject;

    @Before
    public void setup() {
    }

    @Test
    public void testAddProperty_mismatchType() throws ConfigMeException {
        Property<?> property = new Object();
        subject.add(property);
        throw new ConfigMeException("Expected a Property object");
    }

}