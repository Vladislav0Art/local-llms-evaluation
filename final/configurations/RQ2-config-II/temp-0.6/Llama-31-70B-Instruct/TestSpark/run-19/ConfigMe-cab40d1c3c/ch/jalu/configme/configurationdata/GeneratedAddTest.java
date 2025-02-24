package ch.jalu.configme.configurationdata;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAddTest {

    private PropertyListBuilder propertyListBuilder;

    @Before
    public void setUp() {
        propertyListBuilder = new PropertyListBuilder();
    }

    @Test
    public void addTest() {
        Property property = mock(Property.class);

        propertyListBuilder.add(property);

        verify(property, times(1)).getName();
        verify(property, times(1)).getDefaultValue();
        verify(property, times(1)).getDescription();
    }

}