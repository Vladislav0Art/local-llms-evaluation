package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedAddSingleObjectTest {

    @Test
    public void addSingleObjectTest() {
        // Arrange & Act
        List<Object> objectList = new ArrayList<>();
        PropertyListBuilder builder = new PropertyListBuilder();
        Object object = new Object();
        builder.add(object);

        // Assert
        assertEquals(1, ((PropertyListBuilder) builder).create().size());
    }

}