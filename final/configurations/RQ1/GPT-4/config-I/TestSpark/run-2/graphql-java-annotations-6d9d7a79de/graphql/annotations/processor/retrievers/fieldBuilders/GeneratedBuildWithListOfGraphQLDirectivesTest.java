package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.util.DirectiveJavaAnnotationUtil;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildWithListOfGraphQLDirectivesTest {

    @Test
    public void buildWithListOfGraphQLDirectivesTest() {
        Annotation annotatedElement = mock(Annotation.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);
        GraphQLDirective directive = mock(GraphQLDirective.class);
        GraphQLDirectives directives = mock(GraphQLDirectives.class);
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(annotatedElement, container);

        when(annotatedElement.getAnnotation(GraphQLDirectives.class)).thenReturn(directives);

        try {
            GraphQLDirective[] result = directivesBuilder.build();
            fail("Exception not thrown");
        } catch (Exception e) {
            assertEquals(String.format(DirectivesBuilder.NOT_FOUND_IN_DIRECTIVE_REGISTRY_ERROR, "N/A"), e.getMessage());
        }
    }

}