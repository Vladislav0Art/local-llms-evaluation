package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.retrievers.fieldBuilders.GraphQLDirective;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import graphql.schema.GraphQLType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class GeneratedBuild_directiveAnnotations_correctGraphQLDirectives {

    private DirectivesBuilder directivesBuilder;
    private AnnotatedElement annotatedElement;
    private ProcessingElementsContainer processingElementsContainer;

    @Test
    public void build_directiveAnnotations_correctGraphQLDirectives() {
        // Arrange
        directivesBuilder = new DirectivesBuilder(annotatedElement, processingElementsContainer);
        List<GraphQLDirective> expectedGraphQLDirectives = new ArrayList<>();

        // Act
        GraphQLDirective[] actualGraphQLDirectives = directivesBuilder.build();

        // Assert
        assertArrayEquals(expectedGraphQLDirectives.toArray(), actualGraphQLDirectives);
    }

}