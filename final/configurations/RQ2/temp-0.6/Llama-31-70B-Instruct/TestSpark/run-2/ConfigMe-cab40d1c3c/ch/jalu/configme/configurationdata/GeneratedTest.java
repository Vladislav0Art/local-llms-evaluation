package ch.jalu.configme.configurationdata;

public class GeneratedTest {

    private PropertyListBuilder propertyListBuilder;

    @Test
    public void addTest() throws Exception {
        Property property = new Property() {
            @Override
            public Object getDefaultValue() {
                return null;
            }

            @Override
            public String getPath() {
                return null;
            }

            @Override
            public String getName() {
                return null;
            }

            @Override
            public Class<?> getType() {
                return null;
            }

            @Override
            public <T> T getValue() {
                return null;
            }
        };

        propertyListBuilder.add(property);

        assertNotNull(propertyListBuilder.getRootEntries());
    }

    @Test
    public void addExceptionTest() throws Exception {
        Property property = null;
        propertyListBuilder.add(property);
    }

    @Test
    public void createTest() throws Exception {
        List<Property<?>> propertyList = propertyListBuilder.create();

        assertNotNull(propertyList);
        assertTrue(propertyList instanceof ArrayList);
    }

    @Test
    public void getRootEntriesTest() throws Exception {
        Map<String, Object> rootEntries = propertyListBuilder.getRootEntries();

        assertNotNull(rootEntries);
        assertTrue(rootEntries instanceof LinkedHashMap);
    }

}