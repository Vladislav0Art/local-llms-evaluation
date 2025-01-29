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

public class GeneratedTest {

    public GraphQLDirective[] build() {
        return new ArrayList<>();
    }

    @BeforeEach
    void setup() {
    }

    @AfterEach
    void tearDown() {
        // no-op
    }

    @Test
    public void [MethodUnderTest]

    DirectivesBuilderBuild_returnsDirectives() {
        // Arrange
        AnnotatedElement object = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);

        // Act
        GraphQLDirective[] result = new DirectivesBuilder(object, container).build();

        // Assert
        Arrays.asList(result).size();
    }

    @Test
    public void [MethodUnderTest]

    DirectivesBuilderBuild_returnsEmptyArray_ifNoDirectives() {
        // Arrange
        AnnotatedElement object = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);

        // Act
        GraphQLDirective[] result = new DirectivesBuilder(object, container).build();

        // Assert
        Arrays.asList(result).size();
    }

    @Test
    public void [MethodUnderTest]

    DirectivesBuilderBuild_returnsEmptyArray_ifNoDirective() {
        // Arrange
        AnnotatedElement object = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);

        // Act
        GraphQLDirective[] result = new DirectivesBuilder(object, container).build();

        // Assert
        Arrays.asList(result).size();
    }

    @Test
    public void [MethodUnderTest]

    DirectivesBuilder_build_directive_returnsDirective() {
        // Arrange
        AnnotatedElement object = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);

        // Act
        GraphQLDirective[] result = new DirectivesBuilder(object, container).build();

        // Assert
        Arrays.asList(result).size();
    }

    @Test
    public void [MethodUnderTest]

    DirectivesBuilder_build_directive_returnsSameObject_asInput() {
        // Arrange
        AnnotatedElement object = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);

        // Act
        GraphQLDirective[] result = new DirectivesBuilder(object, container).build();

        // Assert
        Arrays.asList(result).size();
    }

    @Test
    public void [MethodUnderTest]

    DirectivesBuilder_build_returnsNull_ifObject_isNull() {
        // Arrange
        AnnotatedElement object = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);

        // Act
        GraphQLDirective[] result = new DirectivesBuilder(object, container).build();

        // Assert
        Arrays.asList(result).size();
    }

    @Test
    public void [MethodUnderTest]

    DirectivesBuilder_build_returnsNull_ifContainer_isNull() {
        // Arrange
        AnnotatedElement object = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = null;

        // Act
        GraphQLDirective[] result = new DirectivesBuilder(object, container).build();

        // Assert
        Arrays.asList(result).size();
    }

    @Test
    public void [MethodUnderTest]

    DirectivesBuilder_build_returnsNull_ifContainer_isEmpty() {
        // Arrange
        AnnotatedElement object = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = new ArrayList<>();

        // Act
        GraphQLDirective[] result = new DirectivesBuilder(object, container).build();

        // Assert
        Arrays.asList(result).size();
    }

    @Test
    public void [MethodUnderTest]

    DirectivesBuilder_build_returnsNull_ifDirectivesAreEmpty() {
        // Arrange
        AnnotatedElement object = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = new ArrayList<>();
        List<GraphQLDirective> directives = new ArrayList<>();

        // Act
        GraphQLDirective[] result = new DirectivesBuilder(object, container).build();

        // Assert
        Arrays.asList(result).size();
    }

    @Test
    public void [MethodUnderTest]

    DirectivesBuilder_build_returnsNull_ifAllMethodsAreFalse() {
        // Arrange
        AnnotatedElement object = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = new ArrayList<>();
        List<GraphQLDirective> directives = new ArrayList<>();

        // Act
        GraphQLDirective[] result = new DirectivesBuilder(object, container).build();

        // Assert
        Arrays.asList(result).size();
    }

    @Test
    public void [MethodUnderTest]

    DirectivesBuilder_build_returnsNull_ifAllMethodsAreTrue() {
        // Arrange
        AnnotatedElement object = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = new ArrayList<>();
        List<GraphQLDirective> directives = new ArrayList<>();

        // Act
        GraphQLDirective[] result = new DirectivesBuilder(object, container).build();

        // Assert
        Arrays.asList(result).size();
    }

    @Test
    public void [MethodUnderTest]

    DirectivesBuilder_build_returnsNull_ifAllMethodsAreAnd() {
        // Arrange
        AnnotatedElement object = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = new ArrayList<>();
        List<GraphQLDirective> directives = new ArrayList<>();

        // Act
        GraphQLDirective[] result = new DirectivesBuilder(object, container).build();

        // Assert
        Arrays.asList(result).size();
    }

    @Test
    public void [MethodUnderTest]

    DirectivesBuilder_build_returnsNull_ifAllMethodsAreOr() {
        // Arrange
        AnnotatedElement object = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = new ArrayList<>();
        List<GraphQLDirective> directives = new ArrayList<>();

        // Act
        GraphQLDirective[] result = new DirectivesBuilder(object, container).build();

        // Assert
        Arrays.asList(result).size();
    }

    @Test
    public void [MethodUnderTest]

    DirectivesBuilder_build_returnsNull_ifMethodsAreAllSame() {
        // Arrange
        AnnotatedElement object = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = new ArrayList<>();
        List<GraphQLDirective> directives = Arrays.asList(mock(GraphQLDirective.class));

        // Act
        GraphQLDirective[] result = new DirectivesBuilder(object, container).build();

        // Assert
        Arrays.asList(result).size();
    }

    @Test
    public void [MethodUnderTest]

    DirectivesBuilder_build_returnsNull_ifMethodsAreAllDifferent() {
        // Arrange
        AnnotatedElement object = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = new ArrayList<>();
        List<GraphQLDirective> directives = Arrays.asList(mock(GraphQLDirective.class));

        // Act
        GraphQLDirective[] result = new DirectivesBuilder(object, container).build();

        // Assert
        Arrays.asList(result).size();
    }

}