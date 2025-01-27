package ch.jalu.configme.configurationdata;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private List<Property<?>> properties;

    @Mock
    private Map<String, Object> rootEntries;

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("ch.jalu.configme.configurationdata.PropertyListBuilderTest");
    }

    public PropertyListBuilderTest() {
    }

    @RunWith(MockitoJUnitRunner.class)
    public class PropertyListBuilder {

        private List<Property<?>> properties;

        public PropertyListBuilder(List<Property<?>> properties) {
            this.properties = properties;
        }

    }