package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static graphql.schema.GraphQLDirective.newDirective;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;

public class Generated[MethodUnderTest]

DirectivesBuilder_build_directive_returnsSameObject_asInput {

    public GraphQLDirective[] build () {
        return new ArrayList<>();
    }

    @BeforeEach
    void setup () {
    }

    @AfterEach
    void tearDown () {
        // no-op
    }

    @Test
    public void [MethodUnderTest]DirectivesBuilder_build_directive_returnsSameObject_asInput() {
        // Arrange
        AnnotatedElement object = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);

        // Act
        GraphQLDirective[] result = new DirectivesBuilder(object, container).build();

        // Assert
        Arrays.asList(result).size();
    }

}