package ch.jalu.configme.configurationdata;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestAdd_SimpleEntry {

    private MockPropertyList mockPropertyList;

    @Before
    public void setup() {
        this.mockPropertyList = new MockPropertyList();
    }

    @After
    public void tearDown() {
        this.mockPropertyList = null;
    }

    @Test
    public void testAdd_SimpleEntry() throws ConfigMeException {
        // Arrange
        Property<String> simpleEntry = new DefaultEntry("simple");

        // Act
        this.propertyListBuilder.add(simpleEntry);

        // Assert
        List<Property<?>> propertyLists = this.propertyLists;
        assert !propertyLists.isEmpty();
    }

}