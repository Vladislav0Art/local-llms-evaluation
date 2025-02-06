package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedConstructorTest {

    @Test
    public void constructorTest() {
        // Arrange
        Map<String, List<String>> comments = new HashMap<>();

        // Act
        CommentsConfiguration configuration = new CommentsConfiguration(comments);

        // Assert
        assertNotNull(configuration);
    }

}