// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MetaParser}.
 */
public interface MetaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MetaParser#meta}.
	 * @param ctx the parse tree
	 */
	void enterMeta(MetaParser.MetaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaParser#meta}.
	 * @param ctx the parse tree
	 */
	void exitMeta(MetaParser.MetaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaParser#typealiases}.
	 * @param ctx the parse tree
	 */
	void enterTypealiases(MetaParser.TypealiasesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaParser#typealiases}.
	 * @param ctx the parse tree
	 */
	void exitTypealiases(MetaParser.TypealiasesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaParser#typealias}.
	 * @param ctx the parse tree
	 */
	void enterTypealias(MetaParser.TypealiasContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaParser#typealias}.
	 * @param ctx the parse tree
	 */
	void exitTypealias(MetaParser.TypealiasContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaParser#grammarName}.
	 * @param ctx the parse tree
	 */
	void enterGrammarName(MetaParser.GrammarNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaParser#grammarName}.
	 * @param ctx the parse tree
	 */
	void exitGrammarName(MetaParser.GrammarNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(MetaParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(MetaParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaParser#rules}.
	 * @param ctx the parse tree
	 */
	void enterRules(MetaParser.RulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaParser#rules}.
	 * @param ctx the parse tree
	 */
	void exitRules(MetaParser.RulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaParser#rulee}.
	 * @param ctx the parse tree
	 */
	void enterRulee(MetaParser.RuleeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaParser#rulee}.
	 * @param ctx the parse tree
	 */
	void exitRulee(MetaParser.RuleeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaParser#terminalRule}.
	 * @param ctx the parse tree
	 */
	void enterTerminalRule(MetaParser.TerminalRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaParser#terminalRule}.
	 * @param ctx the parse tree
	 */
	void exitTerminalRule(MetaParser.TerminalRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaParser#terminalLiteral}.
	 * @param ctx the parse tree
	 */
	void enterTerminalLiteral(MetaParser.TerminalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaParser#terminalLiteral}.
	 * @param ctx the parse tree
	 */
	void exitTerminalLiteral(MetaParser.TerminalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaParser#terminalName}.
	 * @param ctx the parse tree
	 */
	void enterTerminalName(MetaParser.TerminalNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaParser#terminalName}.
	 * @param ctx the parse tree
	 */
	void exitTerminalName(MetaParser.TerminalNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaParser#nonTerminalRule}.
	 * @param ctx the parse tree
	 */
	void enterNonTerminalRule(MetaParser.NonTerminalRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaParser#nonTerminalRule}.
	 * @param ctx the parse tree
	 */
	void exitNonTerminalRule(MetaParser.NonTerminalRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaParser#nonTerminalBody}.
	 * @param ctx the parse tree
	 */
	void enterNonTerminalBody(MetaParser.NonTerminalBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaParser#nonTerminalBody}.
	 * @param ctx the parse tree
	 */
	void exitNonTerminalBody(MetaParser.NonTerminalBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaParser#alternative}.
	 * @param ctx the parse tree
	 */
	void enterAlternative(MetaParser.AlternativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaParser#alternative}.
	 * @param ctx the parse tree
	 */
	void exitAlternative(MetaParser.AlternativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaParser#production}.
	 * @param ctx the parse tree
	 */
	void enterProduction(MetaParser.ProductionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaParser#production}.
	 * @param ctx the parse tree
	 */
	void exitProduction(MetaParser.ProductionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaParser#nonTerminalName}.
	 * @param ctx the parse tree
	 */
	void enterNonTerminalName(MetaParser.NonTerminalNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaParser#nonTerminalName}.
	 * @param ctx the parse tree
	 */
	void exitNonTerminalName(MetaParser.NonTerminalNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaParser#eps}.
	 * @param ctx the parse tree
	 */
	void enterEps(MetaParser.EpsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaParser#eps}.
	 * @param ctx the parse tree
	 */
	void exitEps(MetaParser.EpsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(MetaParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(MetaParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(MetaParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(MetaParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(MetaParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(MetaParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(MetaParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(MetaParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaParser#alias}.
	 * @param ctx the parse tree
	 */
	void enterAlias(MetaParser.AliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaParser#alias}.
	 * @param ctx the parse tree
	 */
	void exitAlias(MetaParser.AliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaParser#skipe}.
	 * @param ctx the parse tree
	 */
	void enterSkipe(MetaParser.SkipeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaParser#skipe}.
	 * @param ctx the parse tree
	 */
	void exitSkipe(MetaParser.SkipeContext ctx);
}