package ch.jalu.configme.configurationdata;

public class GeneratedTestAddProperty_emptyList {

    private PropertyListBuilder subject;

    @Before
    public void setup() {
    }

    @Test
    public void testAddProperty_emptyList() {
        subject.add(new ArrayList<>());
        List<Property<?>> properties = subject.create();
        assertNotNull(properties);
        assertEquals(0, properties.size());
    }

}