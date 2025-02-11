package ch.jalu.configme.configurationdata;

public class GeneratedTestAddProperty {

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

}