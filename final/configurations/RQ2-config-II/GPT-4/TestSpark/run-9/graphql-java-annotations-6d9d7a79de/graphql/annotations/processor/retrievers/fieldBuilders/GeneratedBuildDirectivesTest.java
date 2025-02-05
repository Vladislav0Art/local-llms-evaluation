package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.GraphQLAnnotations;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLEnumType;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.stream.Stream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedBuildDirectivesTest {

    @Test
    public void buildDirectivesTest() throws NoSuchMethodException {
        // Arrange
        Method testMethod = TestClass.class.getMethod("testMethod");
        TestClass testClass = new TestClass();
        ProcessingElementsContainer container = new ProcessingElementsContainer();
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(testMethod, container);

        // Act
        GraphQLDirective[] directives = directivesBuilder.build();

        // Assert
        assertNotNull(directives);
        assertTrue(directives.length > 0);
    }

}