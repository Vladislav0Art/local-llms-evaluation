package ch.jalu.configme.configurationdata;

public class GeneratedAddTest {

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

}