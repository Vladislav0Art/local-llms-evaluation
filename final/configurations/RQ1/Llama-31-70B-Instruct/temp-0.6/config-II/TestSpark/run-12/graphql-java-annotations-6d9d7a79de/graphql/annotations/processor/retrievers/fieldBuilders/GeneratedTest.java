package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.retrievers.fieldBuilders.GraphQLDirective;
import graphql.schema.GraphQLDirective;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void build_GivenDirectivesJavaAnnotationUtil_ShouldReturnGraphQLDirectiveArray() {
        //given
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(null, null);
        DirectiveJavaAnnotationUtil directiveJavaAnnotationUtil = mock(DirectiveJavaAnnotationUtil.class);
        GraphQLDirective graphQLDirective = mock(GraphQLDirective.class);
        when(directiveJavaAnnotationUtil.getDirectiveAnnotations(null)).thenReturn(Arrays.asList(graphQLDirective));

        //when
        GraphQLDirective[] result = directivesBuilder.build();

        //then
        assertArrayEquals(new GraphQLDirective[]{graphQLDirective}, result);
    }

}