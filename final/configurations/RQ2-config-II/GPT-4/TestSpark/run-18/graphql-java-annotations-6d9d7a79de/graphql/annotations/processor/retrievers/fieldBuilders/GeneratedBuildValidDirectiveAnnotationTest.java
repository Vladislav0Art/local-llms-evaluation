package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.util.DirectiveJavaAnnotationUtil;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import graphql.schema.GraphQLType;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Field;

public class GeneratedBuildValidDirectiveAnnotationTest {

    @Test
    public void buildValidDirectiveAnnotationTest() {
        // Prepare
        Field field = Mockito.mock(Field.class);
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        DirectiveJavaAnnotationUtil directiveUtil = Mockito.mock(DirectiveJavaAnnotationUtil.class);
        GraphQLDirectives directiveAnnotation = Mockito.mock(GraphQLDirectives.class);
        Mockito.when(field.getAnnotations()).thenReturn(new Annotation[]{directiveAnnotation});
        Mockito.when(container.getDirectiveJavaAnnotationUtil()).thenReturn(directiveUtil);

        GraphQLDirective directive = Mockito.mock(GraphQLDirective.class);
        Mockito.when(directiveUtil.getGraphQLDirective(directiveAnnotation, field)).thenReturn(directive);

        // Action
        DirectivesBuilder builder = new DirectivesBuilder(field, container);
        GraphQLDirective[] result = builder.build();

        // Verify
        Assert.assertEquals(1, result.length);
        Assert.assertEquals(directive, result[0]);
    }

}