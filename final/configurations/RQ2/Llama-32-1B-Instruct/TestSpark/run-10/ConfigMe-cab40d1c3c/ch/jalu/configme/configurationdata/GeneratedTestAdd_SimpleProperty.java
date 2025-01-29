package ch.jalu.configme.configurationdata;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestAdd_SimpleProperty {

    private MockPropertyList mockPropertyList;

    @Before
    public void setup() {
        this.mockPropertyList = mock(Property < List < Property < ? >>> ());
    }

    @After
    public void tearDown() {
        this.mockPropertyList = null;
    }

    @Test
    public void testAdd_SimpleProperty() throws ConfigMeException {
        // Arrange
        Property<String> simpleProperty = new DefaultEntry("simple");

        // Act
        this.propertyListBuilder.add(simpleProperty);

        // Assert
        List<Property<?>> propertyLists = this.propertyLists;
        assert !propertyLists.isEmpty();
    }

}