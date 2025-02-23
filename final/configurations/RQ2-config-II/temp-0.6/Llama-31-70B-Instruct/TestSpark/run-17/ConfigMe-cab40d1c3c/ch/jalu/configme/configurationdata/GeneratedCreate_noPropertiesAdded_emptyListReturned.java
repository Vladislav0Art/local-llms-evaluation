package ch.jalu.configme.configurationdata;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCreate_noPropertiesAdded_emptyListReturned {

    private PropertyListBuilder propertyListBuilder;

    @Before
    public void setUp() {
        propertyListBuilder = new PropertyListBuilder();
    }

    @Test
    public void create_noPropertiesAdded_emptyListReturned() {
        assertTrue(propertyListBuilder.create().isEmpty());
    }

}