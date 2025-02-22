package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.when;

public class GeneratedTest {

    private PropertyListBuilder propertyListBuilder;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        propertyListBuilder = new PropertyListBuilder();
    }

    @Test
    public void addProperty_validProperty_listIsNotEmpty() throws Exception {
        Property property = Mockito.mock(Property.class);
        when(property.getPath()).thenReturn("test");

        propertyListBuilder.add(property);

        assertEquals(1, propertyListBuilder.getRootEntries().size());
    }

    @Test
    public void addProperty_existingProperty_exceptionIsThrown() throws Exception {
        Property property = Mockito.mock(Property.class);
        when(property.getPath()).thenReturn("test");
        propertyListBuilder.add(property);

        propertyListBuilder.add(property);
    }

    @Test
    public void create_emptyList_listIsCreated() throws Exception {
        assertEquals(0, propertyListBuilder.create().size());
    }

}