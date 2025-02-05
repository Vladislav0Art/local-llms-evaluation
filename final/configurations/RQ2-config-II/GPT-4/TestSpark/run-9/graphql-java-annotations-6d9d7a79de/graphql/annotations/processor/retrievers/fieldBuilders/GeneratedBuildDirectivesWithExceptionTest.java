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

public class GeneratedBuildDirectivesWithExceptionTest {

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

}