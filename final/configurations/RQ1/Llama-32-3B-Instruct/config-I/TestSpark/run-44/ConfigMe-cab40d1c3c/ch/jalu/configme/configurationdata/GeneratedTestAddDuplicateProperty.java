package ch.jalu.configme.configurationdata;

public class GeneratedTestAddDuplicateProperty {

    private ConfigMeTest configMeTest;

    @Before
    public void setup() {
        configMeTest = new ConfigMeTest();
    }

    @Test
    public void testAddDuplicateProperty() {
        configMeTest.addProperty("DataSource", "mysql");
        configMeTest.addProperty("DataSource", "mysql");
    }

}