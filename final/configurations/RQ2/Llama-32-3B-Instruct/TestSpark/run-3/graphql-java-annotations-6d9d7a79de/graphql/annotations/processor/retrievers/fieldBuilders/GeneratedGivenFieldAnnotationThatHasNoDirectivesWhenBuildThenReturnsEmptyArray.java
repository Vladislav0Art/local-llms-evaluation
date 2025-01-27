package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.lang.reflect.AnnotatedElement;
import java.util.Arrays;
import java.util.List;

import static graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;
import static graphql.annotations.processor.exceptions.GraphQLAnnotationsException.newGraphQlAnnotationsException;
import static java.util.Collections.emptyList;
import static java.util.stream.Collectors.toList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGivenFieldAnnotationThatHasNoDirectivesWhenBuildThenReturnsEmptyArray {

    @Mock
    private ProcessingElementsContainer container;

    public DirectivesBuilder createDirectivesBuilder(AnnotatedElement object) {
        return new DirectivesBuilder(object, this.container);
    }

    @Test
    public void givenFieldAnnotationThatHasNoDirectivesWhenBuildThenReturnsEmptyArray() {
        AnnotatedElement element = Mockito.mock(AnnotatedElement.class);
        Mockito.when(element.isAnnotationPresent(DirectivesBuilder.class)).thenReturn(false);

        List<GraphQLDirective> expected = emptyList();

        DirectivesBuilder builder = createDirectivesBuilder(element);
        GraphQLDirective[] actual = builder.build();
        assertEquals(expected, actual);
    }

}