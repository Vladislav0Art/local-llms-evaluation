package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.util.DirectiveJavaAnnotationUtil;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import graphql.schema.GraphQLType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

public class GeneratedBuildMethodReturnsDirectivesWhenPresentTest {

    @Mock
    private ProcessingElementsContainer container;

    public List<GraphQLDirective> getDirectivesFromAnnotatedClass(AnnotatedElement element) {
        return Arrays.asList(new GraphQLDirective("directive1"), new GraphQLDirective("directive2"));
    }

    @Test
    public void buildMethodReturnsDirectivesWhenPresentTest() throws Exception {
        // Given
        AnnotatedElement element = Mockito.mock(AnnotatedElement.class);
        DirectivesBuilder builder = new DirectivesBuilder(element, container);

        // When
        GraphQLDirective[] result = builder.build();

        // Then
        assertEquals(2, result.length);
    }

}