package ch.jalu.configme.configurationdata;

public class GeneratedTest {

    private ConfigMeTest configMeTest;

    @Before
    public void setup() {
        configMeTest = new ConfigMeTest();
    }

    @Test
    public void testAddProperty() {
        configMeTest.addProperty("DataSource", "mysql");
        assertEquals(1, configMeTest.getRootEntries().size());
    }

    @Test
    public void testAddDuplicateProperty() {
        configMeTest.addProperty("DataSource", "mysql");
        configMeTest.addProperty("DataSource", "mysql");
    }

    @Test
    public void testCreateProperties() {
        List<ConfigMeTest.Property> result = new ArrayList<>();
        configMeTest.addProperty("DataSource", "mysql");
        configMeTest.addProperty("security", "password");
        assertEquals(2, configMeTest.create().size());
    }

    @Test
    public void testAddRootProperty() {
        Map<String, Object> map = new HashMap<>();
        configMeTest.addRootProperty(map, "root");
        assertEquals(1, map.size());
    }
}

public class ConfigMeTest {

    private List<ConfigMe.Property> rootEntries;

    public ConfigMeTest() {
        this.rootEntries = new ArrayList<>();
    }

    public void addProperty(String name, String value) {
        if (this.rootEntries.isEmpty()) {
            throw new RuntimeException("Cannot add duplicate property to the config.");
        }
        this.rootEntries.add(new Property(name, value));
    }

    public List<ConfigMe.Property> getRootEntries() {
        return this.rootEntries;
    }

    public Map<String, Object> create() {
        Map<String, Object> map = new LinkedHashMap<>();
        for (ConfigMe.Property property : rootEntries) {
            map.put(property.getName(), property.getValue());
        }
        return map;
    }

    public static class Property implements ConfigMe.Property {
        private String name;
        private String value;

        public Property(String name, String value) {
            this.name = name;
            this.value = value;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public String getValue() {
            return value;
        }
    }

}

public class ConfigMe {

    private List<ConfigMe.Property> rootEntries;

    public ConfigMe() {
        this.rootEntries = new ArrayList<>();
    }

    public void addProperty(ConfigMe.Property property) {
        if (this.rootEntries.isEmpty()) {
            throw new RuntimeException("Cannot add duplicate property to the config.");
        }
    }

    public List<ConfigMe.Property> getRootEntries() {
        return this.rootEntries;
    }

    public static class Property implements ConfigMe.Property {
        private String name;
        private String value;

        public Property(String name, String value) {
            this.name = name;
            this.value = value;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public String getValue() {
            return value;
        }
    }

}