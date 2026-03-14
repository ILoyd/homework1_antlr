// Generated from C:/repos/homework1_antlr/src/statemodel/StateModel.g4 by ANTLR 4.13.2
package statemodel.generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link StateModelParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface StateModelVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link StateModelParser#model}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel(StateModelParser.ModelContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#statesBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatesBlock(StateModelParser.StatesBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#stateDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateDef(StateModelParser.StateDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#stateLabels}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateLabels(StateModelParser.StateLabelsContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#transitionsBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransitionsBlock(StateModelParser.TransitionsBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#transitionElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransitionElement(StateModelParser.TransitionElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#schemaDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaDef(StateModelParser.SchemaDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#transitionDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransitionDef(StateModelParser.TransitionDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#isInitial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsInitial(StateModelParser.IsInitialContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#stateName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateName(StateModelParser.StateNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#isError}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsError(StateModelParser.IsErrorContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(StateModelParser.IdContext ctx);
}