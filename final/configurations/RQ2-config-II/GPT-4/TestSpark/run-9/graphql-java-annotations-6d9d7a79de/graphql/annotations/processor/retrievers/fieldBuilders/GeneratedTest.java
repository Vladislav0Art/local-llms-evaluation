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

public class GeneratedTest {

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

    @Test
    public void buildDirectivesWithExceptionTest() {
        // Arrange
        Method testMethod = TestClassWithoutDirectives.class.getMethod("testMethod");
        TestClassWithoutDirectives testClass = new TestClassWithoutDirectives();
        ProcessingElementsContainer container = new ProcessingElementsContainer();
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(testMethod, container);

        // Act
        directivesBuilder.build();
    }

    @Test
    public void buildDirectivesWithMockedContainerTest() {
        // Arrange
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);
        when(container.getDirective(Mockito.anyString())).thenReturn(GraphQLDirective.newDirective().name("MOCK").build());
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(TestClass.class, container);

        // Act
        List<GraphQLDirective> directives = Stream.of(directivesBuilder.build()).collect(Collectors.toList());

        // Assert
        assertTrue(directives.stream().anyMatch(directive -> directive.getName().equals("MOCK")));
    }

    class TestClass {
        @GraphQLDirectives({
                @GraphQLDirective(name = "testDirective", arguments = {
                        @GraphQLArgument(name = "testArg", type = GraphQLEnumType.class, value = "TEST")
                })
        })
        public void testMethod() {
            // implementation
        }
    }

    class TestClassWithoutDirectives {
        public void testMethod() {
            // implementation
        }
    }

}