package ch.jalu.configme.configurationdata;

public class GeneratedTestAddMultipleProperties_emptyList {

    private PropertyListBuilder subject;

    @Before
    public void setup() {
    }

    @Test
    public void testAddMultipleProperties_emptyList() {
        subject.add(new ArrayList<>());
        List<Property<?>> properties = subject.create();
        assertNotNull(properties);
        assertEquals(0, properties.size());
    }

}