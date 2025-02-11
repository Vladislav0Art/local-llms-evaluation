package ch.jalu.configme.configurationdata;

public class GeneratedTestCreateProperties {

    private ConfigMeTest configMeTest;

    @Before
    public void setup() {
        configMeTest = new ConfigMeTest();
    }

    @Test
    public void testCreateProperties() {
        List<ConfigMeTest.Property> result = new ArrayList<>();
        configMeTest.addProperty("DataSource", "mysql");
        configMeTest.addProperty("security", "password");
        assertEquals(2, configMeTest.create().size());
    }

}