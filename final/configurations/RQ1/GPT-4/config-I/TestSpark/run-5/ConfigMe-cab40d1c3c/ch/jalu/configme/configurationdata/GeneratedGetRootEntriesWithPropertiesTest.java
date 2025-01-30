package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.IntegerProperty;
import ch.jalu.configme.properties.Property;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.List;
import java.util.Map;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class GeneratedGetRootEntriesWithPropertiesTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    private PropertyListBuilder underTest = new PropertyListBuilder();

    // Test for add method

    @Test
    public void getRootEntriesWithPropertiesTest() {
        // Given
        Property<?> property = new IntegerProperty("DataSource.mysql.Port", 3306);
        underTest.add(property);

        // When
        Map<String, Object> entries = underTest.getRootEntries();

        // Then
        assertThat(entries.containsKey("DataSource"), is(true));
    }

}