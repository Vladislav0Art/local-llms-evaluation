package ch.jalu.configme.configurationdata;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestCreate {

    private Property<String> defaultEntry = new DefaultEntry("default", "simple");
    private List<Property<?>> propertyLists;
    private MockPropertyList mockPropertyList;

    @Before
    public void setup() {
        this.propertyLists = null;
        this.mockPropertyList = mock(Property < List < Property < ? >>> > ());
    }

    @After
    public void tearDown() {
        this.mockPropertyList = null;
    }

    @Test
    public void testCreate() {
        // Arrange
        Property<String> defaultEntry = new DefaultEntry("default", "simple");

        // Act
        List<Property<?>> propertyLists = this.propertyListBuilder.create();

        // Assert
        this.mockPropertyList.set(getRootEntries().get(0), defaultEntry);
    }

}