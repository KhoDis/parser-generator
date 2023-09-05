// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MetaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MetaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MetaParser#meta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMeta(MetaParser.MetaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaParser#typealiases}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypealiases(MetaParser.TypealiasesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaParser#typealias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypealias(MetaParser.TypealiasContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaParser#grammarName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrammarName(MetaParser.GrammarNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(MetaParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaParser#rules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRules(MetaParser.RulesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaParser#rulee}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRulee(MetaParser.RuleeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaParser#terminalRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminalRule(MetaParser.TerminalRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaParser#terminalLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminalLiteral(MetaParser.TerminalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaParser#terminalName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminalName(MetaParser.TerminalNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaParser#nonTerminalRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonTerminalRule(MetaParser.NonTerminalRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaParser#nonTerminalBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonTerminalBody(MetaParser.NonTerminalBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaParser#alternative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlternative(MetaParser.AlternativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaParser#production}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProduction(MetaParser.ProductionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaParser#nonTerminalName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonTerminalName(MetaParser.NonTerminalNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaParser#eps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEps(MetaParser.EpsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(MetaParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaParser#output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput(MetaParser.OutputContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(MetaParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(MetaParser.ArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaParser#alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias(MetaParser.AliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaParser#skipe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkipe(MetaParser.SkipeContext ctx);
}