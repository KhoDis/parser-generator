// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MetaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, EPS=6, USING=7, INATTR=8, OUTATTR=9, 
		GRAMMAR=10, SKIPE=11, ARROW=12, SEMI=13, REGEX=14, UPPER=15, LOWER=16, 
		OF=17, OR=18, IS=19, WS=20;
	public static final int
		RULE_meta = 0, RULE_typealiases = 1, RULE_typealias = 2, RULE_grammarName = 3, 
		RULE_identifier = 4, RULE_rules = 5, RULE_rulee = 6, RULE_terminalRule = 7, 
		RULE_terminalLiteral = 8, RULE_terminalName = 9, RULE_nonTerminalRule = 10, 
		RULE_nonTerminalBody = 11, RULE_alternative = 12, RULE_production = 13, 
		RULE_nonTerminalName = 14, RULE_eps = 15, RULE_input = 16, RULE_output = 17, 
		RULE_args = 18, RULE_arg = 19, RULE_alias = 20, RULE_skipe = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"meta", "typealiases", "typealias", "grammarName", "identifier", "rules", 
			"rulee", "terminalRule", "terminalLiteral", "terminalName", "nonTerminalRule", 
			"nonTerminalBody", "alternative", "production", "nonTerminalName", "eps", 
			"input", "output", "args", "arg", "alias", "skipe"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<'", "'>'", "'['", "']'", "','", "'EPS'", "'using'", null, null, 
			"'grammar'", "'skip'", "'->'", "';'", null, null, null, "':'", "'|'", 
			"'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "EPS", "USING", "INATTR", "OUTATTR", 
			"GRAMMAR", "SKIPE", "ARROW", "SEMI", "REGEX", "UPPER", "LOWER", "OF", 
			"OR", "IS", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MetaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MetaContext extends ParserRuleContext {
		public GrammarNameContext grammarName() {
			return getRuleContext(GrammarNameContext.class,0);
		}
		public RulesContext rules() {
			return getRuleContext(RulesContext.class,0);
		}
		public TypealiasesContext typealiases() {
			return getRuleContext(TypealiasesContext.class,0);
		}
		public MetaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaListener ) ((MetaListener)listener).enterMeta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaListener ) ((MetaListener)listener).exitMeta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaVisitor ) return ((MetaVisitor<? extends T>)visitor).visitMeta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetaContext meta() throws RecognitionException {
		MetaContext _localctx = new MetaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_meta);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			grammarName();
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(45);
				typealiases();
				}
			}

			setState(48);
			rules();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypealiasesContext extends ParserRuleContext {
		public List<TypealiasContext> typealias() {
			return getRuleContexts(TypealiasContext.class);
		}
		public TypealiasContext typealias(int i) {
			return getRuleContext(TypealiasContext.class,i);
		}
		public TypealiasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typealiases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaListener ) ((MetaListener)listener).enterTypealiases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaListener ) ((MetaListener)listener).exitTypealiases(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaVisitor ) return ((MetaVisitor<? extends T>)visitor).visitTypealiases(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypealiasesContext typealiases() throws RecognitionException {
		TypealiasesContext _localctx = new TypealiasesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_typealiases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(50);
				typealias();
				}
				}
				setState(53); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==USING );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypealiasContext extends ParserRuleContext {
		public Token name;
		public Token type;
		public TerminalNode USING() { return getToken(MetaParser.USING, 0); }
		public TerminalNode IS() { return getToken(MetaParser.IS, 0); }
		public TerminalNode OUTATTR() { return getToken(MetaParser.OUTATTR, 0); }
		public TerminalNode SEMI() { return getToken(MetaParser.SEMI, 0); }
		public List<TerminalNode> UPPER() { return getTokens(MetaParser.UPPER); }
		public TerminalNode UPPER(int i) {
			return getToken(MetaParser.UPPER, i);
		}
		public TerminalNode LOWER() { return getToken(MetaParser.LOWER, 0); }
		public TypealiasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typealias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaListener ) ((MetaListener)listener).enterTypealias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaListener ) ((MetaListener)listener).exitTypealias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaVisitor ) return ((MetaVisitor<? extends T>)visitor).visitTypealias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypealiasContext typealias() throws RecognitionException {
		TypealiasContext _localctx = new TypealiasContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_typealias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(USING);
			setState(56);
			((TypealiasContext)_localctx).name = match(UPPER);
			setState(57);
			match(IS);
			setState(58);
			((TypealiasContext)_localctx).type = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==UPPER || _la==LOWER) ) {
				((TypealiasContext)_localctx).type = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(59);
			match(OUTATTR);
			setState(60);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GrammarNameContext extends ParserRuleContext {
		public IdentifierContext name;
		public TerminalNode GRAMMAR() { return getToken(MetaParser.GRAMMAR, 0); }
		public TerminalNode SEMI() { return getToken(MetaParser.SEMI, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public GrammarNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaListener ) ((MetaListener)listener).enterGrammarName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaListener ) ((MetaListener)listener).exitGrammarName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaVisitor ) return ((MetaVisitor<? extends T>)visitor).visitGrammarName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrammarNameContext grammarName() throws RecognitionException {
		GrammarNameContext _localctx = new GrammarNameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_grammarName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(GRAMMAR);
			setState(63);
			((GrammarNameContext)_localctx).name = identifier();
			setState(64);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode UPPER() { return getToken(MetaParser.UPPER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaListener ) ((MetaListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaListener ) ((MetaListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaVisitor ) return ((MetaVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(UPPER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RulesContext extends ParserRuleContext {
		public List<RuleeContext> rulee() {
			return getRuleContexts(RuleeContext.class);
		}
		public RuleeContext rulee(int i) {
			return getRuleContext(RuleeContext.class,i);
		}
		public RulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaListener ) ((MetaListener)listener).enterRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaListener ) ((MetaListener)listener).exitRules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaVisitor ) return ((MetaVisitor<? extends T>)visitor).visitRules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RulesContext rules() throws RecognitionException {
		RulesContext _localctx = new RulesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_rules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UPPER || _la==LOWER) {
				{
				{
				setState(68);
				rulee();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleeContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(MetaParser.SEMI, 0); }
		public TerminalRuleContext terminalRule() {
			return getRuleContext(TerminalRuleContext.class,0);
		}
		public NonTerminalRuleContext nonTerminalRule() {
			return getRuleContext(NonTerminalRuleContext.class,0);
		}
		public RuleeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rulee; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaListener ) ((MetaListener)listener).enterRulee(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaListener ) ((MetaListener)listener).exitRulee(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaVisitor ) return ((MetaVisitor<? extends T>)visitor).visitRulee(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleeContext rulee() throws RecognitionException {
		RuleeContext _localctx = new RuleeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_rulee);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UPPER:
				{
				setState(74);
				terminalRule();
				}
				break;
			case LOWER:
				{
				setState(75);
				nonTerminalRule();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(78);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TerminalRuleContext extends ParserRuleContext {
		public TerminalNameContext name;
		public TerminalLiteralContext literal;
		public TerminalNode OF() { return getToken(MetaParser.OF, 0); }
		public TerminalNameContext terminalName() {
			return getRuleContext(TerminalNameContext.class,0);
		}
		public TerminalLiteralContext terminalLiteral() {
			return getRuleContext(TerminalLiteralContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(MetaParser.ARROW, 0); }
		public SkipeContext skipe() {
			return getRuleContext(SkipeContext.class,0);
		}
		public TerminalRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminalRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaListener ) ((MetaListener)listener).enterTerminalRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaListener ) ((MetaListener)listener).exitTerminalRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaVisitor ) return ((MetaVisitor<? extends T>)visitor).visitTerminalRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminalRuleContext terminalRule() throws RecognitionException {
		TerminalRuleContext _localctx = new TerminalRuleContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_terminalRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			((TerminalRuleContext)_localctx).name = terminalName();
			setState(81);
			match(OF);
			setState(82);
			((TerminalRuleContext)_localctx).literal = terminalLiteral();
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARROW) {
				{
				setState(83);
				match(ARROW);
				setState(84);
				skipe();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TerminalLiteralContext extends ParserRuleContext {
		public TerminalNode REGEX() { return getToken(MetaParser.REGEX, 0); }
		public TerminalLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminalLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaListener ) ((MetaListener)listener).enterTerminalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaListener ) ((MetaListener)listener).exitTerminalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaVisitor ) return ((MetaVisitor<? extends T>)visitor).visitTerminalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminalLiteralContext terminalLiteral() throws RecognitionException {
		TerminalLiteralContext _localctx = new TerminalLiteralContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_terminalLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(REGEX);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TerminalNameContext extends ParserRuleContext {
		public TerminalNode UPPER() { return getToken(MetaParser.UPPER, 0); }
		public TerminalNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminalName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaListener ) ((MetaListener)listener).enterTerminalName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaListener ) ((MetaListener)listener).exitTerminalName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaVisitor ) return ((MetaVisitor<? extends T>)visitor).visitTerminalName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminalNameContext terminalName() throws RecognitionException {
		TerminalNameContext _localctx = new TerminalNameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_terminalName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(UPPER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NonTerminalRuleContext extends ParserRuleContext {
		public NonTerminalNameContext name;
		public NonTerminalBodyContext body;
		public TerminalNode OF() { return getToken(MetaParser.OF, 0); }
		public NonTerminalNameContext nonTerminalName() {
			return getRuleContext(NonTerminalNameContext.class,0);
		}
		public NonTerminalBodyContext nonTerminalBody() {
			return getRuleContext(NonTerminalBodyContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public NonTerminalRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonTerminalRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaListener ) ((MetaListener)listener).enterNonTerminalRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaListener ) ((MetaListener)listener).exitNonTerminalRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaVisitor ) return ((MetaVisitor<? extends T>)visitor).visitNonTerminalRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonTerminalRuleContext nonTerminalRule() throws RecognitionException {
		NonTerminalRuleContext _localctx = new NonTerminalRuleContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_nonTerminalRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			((NonTerminalRuleContext)_localctx).name = nonTerminalName();
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(92);
				input();
				}
			}

			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARROW) {
				{
				setState(95);
				output();
				}
			}

			setState(98);
			match(OF);
			setState(99);
			((NonTerminalRuleContext)_localctx).body = nonTerminalBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NonTerminalBodyContext extends ParserRuleContext {
		public List<AlternativeContext> alternative() {
			return getRuleContexts(AlternativeContext.class);
		}
		public AlternativeContext alternative(int i) {
			return getRuleContext(AlternativeContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(MetaParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(MetaParser.OR, i);
		}
		public NonTerminalBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonTerminalBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaListener ) ((MetaListener)listener).enterNonTerminalBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaListener ) ((MetaListener)listener).exitNonTerminalBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaVisitor ) return ((MetaVisitor<? extends T>)visitor).visitNonTerminalBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonTerminalBodyContext nonTerminalBody() throws RecognitionException {
		NonTerminalBodyContext _localctx = new NonTerminalBodyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_nonTerminalBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			alternative();
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(102);
				match(OR);
				setState(103);
				alternative();
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AlternativeContext extends ParserRuleContext {
		public List<ProductionContext> production() {
			return getRuleContexts(ProductionContext.class);
		}
		public ProductionContext production(int i) {
			return getRuleContext(ProductionContext.class,i);
		}
		public AlternativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alternative; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaListener ) ((MetaListener)listener).enterAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaListener ) ((MetaListener)listener).exitAlternative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaVisitor ) return ((MetaVisitor<? extends T>)visitor).visitAlternative(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlternativeContext alternative() throws RecognitionException {
		AlternativeContext _localctx = new AlternativeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_alternative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(109);
				production();
				}
				}
				setState(112); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 98368L) != 0 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProductionContext extends ParserRuleContext {
		public TerminalNameContext terminalName() {
			return getRuleContext(TerminalNameContext.class,0);
		}
		public NonTerminalNameContext nonTerminalName() {
			return getRuleContext(NonTerminalNameContext.class,0);
		}
		public EpsContext eps() {
			return getRuleContext(EpsContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode IS() { return getToken(MetaParser.IS, 0); }
		public TerminalNode INATTR() { return getToken(MetaParser.INATTR, 0); }
		public TerminalNode OUTATTR() { return getToken(MetaParser.OUTATTR, 0); }
		public ProductionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_production; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaListener ) ((MetaListener)listener).enterProduction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaListener ) ((MetaListener)listener).exitProduction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaVisitor ) return ((MetaVisitor<? extends T>)visitor).visitProduction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProductionContext production() throws RecognitionException {
		ProductionContext _localctx = new ProductionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_production);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(114);
				alias();
				setState(115);
				match(IS);
				}
				break;
			}
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UPPER:
				{
				setState(119);
				terminalName();
				}
				break;
			case LOWER:
				{
				setState(120);
				nonTerminalName();
				}
				break;
			case EPS:
				{
				setState(121);
				eps();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INATTR) {
				{
				setState(124);
				match(INATTR);
				}
			}

			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OUTATTR) {
				{
				setState(127);
				match(OUTATTR);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NonTerminalNameContext extends ParserRuleContext {
		public TerminalNode LOWER() { return getToken(MetaParser.LOWER, 0); }
		public NonTerminalNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonTerminalName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaListener ) ((MetaListener)listener).enterNonTerminalName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaListener ) ((MetaListener)listener).exitNonTerminalName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaVisitor ) return ((MetaVisitor<? extends T>)visitor).visitNonTerminalName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonTerminalNameContext nonTerminalName() throws RecognitionException {
		NonTerminalNameContext _localctx = new NonTerminalNameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_nonTerminalName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(LOWER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EpsContext extends ParserRuleContext {
		public TerminalNode EPS() { return getToken(MetaParser.EPS, 0); }
		public EpsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eps; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaListener ) ((MetaListener)listener).enterEps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaListener ) ((MetaListener)listener).exitEps(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaVisitor ) return ((MetaVisitor<? extends T>)visitor).visitEps(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EpsContext eps() throws RecognitionException {
		EpsContext _localctx = new EpsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_eps);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(EPS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InputContext extends ParserRuleContext {
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaListener ) ((MetaListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaListener ) ((MetaListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaVisitor ) return ((MetaVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(134);
			match(T__0);
			setState(135);
			args();
			setState(136);
			match(T__1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OutputContext extends ParserRuleContext {
		public TerminalNode ARROW() { return getToken(MetaParser.ARROW, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaListener ) ((MetaListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaListener ) ((MetaListener)listener).exitOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaVisitor ) return ((MetaVisitor<? extends T>)visitor).visitOutput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_output);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(138);
			match(ARROW);
			setState(139);
			match(T__2);
			setState(140);
			args();
			setState(141);
			match(T__3);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgsContext extends ParserRuleContext {
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaListener ) ((MetaListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaListener ) ((MetaListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaVisitor ) return ((MetaVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			arg();
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(144);
				match(T__4);
				setState(145);
				arg();
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgContext extends ParserRuleContext {
		public Token name;
		public Token type;
		public TerminalNode OF() { return getToken(MetaParser.OF, 0); }
		public TerminalNode LOWER() { return getToken(MetaParser.LOWER, 0); }
		public TerminalNode UPPER() { return getToken(MetaParser.UPPER, 0); }
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaListener ) ((MetaListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaListener ) ((MetaListener)listener).exitArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaVisitor ) return ((MetaVisitor<? extends T>)visitor).visitArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			((ArgContext)_localctx).name = match(LOWER);
			setState(152);
			match(OF);
			setState(153);
			((ArgContext)_localctx).type = match(UPPER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AliasContext extends ParserRuleContext {
		public TerminalNode LOWER() { return getToken(MetaParser.LOWER, 0); }
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaListener ) ((MetaListener)listener).enterAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaListener ) ((MetaListener)listener).exitAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaVisitor ) return ((MetaVisitor<? extends T>)visitor).visitAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(LOWER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SkipeContext extends ParserRuleContext {
		public TerminalNode SKIPE() { return getToken(MetaParser.SKIPE, 0); }
		public SkipeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skipe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaListener ) ((MetaListener)listener).enterSkipe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaListener ) ((MetaListener)listener).exitSkipe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaVisitor ) return ((MetaVisitor<? extends T>)visitor).visitSkipe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SkipeContext skipe() throws RecognitionException {
		SkipeContext _localctx = new SkipeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_skipe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(SKIPE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0014\u00a0\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0001\u0000\u0001\u0000\u0003\u0000/\b\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0004\u00014\b\u0001\u000b\u0001\f\u00015\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0005\u0005F\b\u0005\n\u0005\f\u0005I\t\u0005\u0001\u0006"+
		"\u0001\u0006\u0003\u0006M\b\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007V\b\u0007"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0003\n^\b\n\u0001\n"+
		"\u0003\na\b\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0005\u000bi\b\u000b\n\u000b\f\u000bl\t\u000b\u0001\f\u0004\fo\b\f\u000b"+
		"\f\f\fp\u0001\r\u0001\r\u0001\r\u0003\rv\b\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r{\b\r\u0001\r\u0003\r~\b\r\u0001\r\u0003\r\u0081\b\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u0093\b\u0012\n\u0012\f\u0012"+
		"\u0096\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0000\u0000\u0016\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*\u0000\u0001\u0001\u0000\u000f\u0010\u0098\u0000,\u0001\u0000"+
		"\u0000\u0000\u00023\u0001\u0000\u0000\u0000\u00047\u0001\u0000\u0000\u0000"+
		"\u0006>\u0001\u0000\u0000\u0000\bB\u0001\u0000\u0000\u0000\nG\u0001\u0000"+
		"\u0000\u0000\fL\u0001\u0000\u0000\u0000\u000eP\u0001\u0000\u0000\u0000"+
		"\u0010W\u0001\u0000\u0000\u0000\u0012Y\u0001\u0000\u0000\u0000\u0014["+
		"\u0001\u0000\u0000\u0000\u0016e\u0001\u0000\u0000\u0000\u0018n\u0001\u0000"+
		"\u0000\u0000\u001au\u0001\u0000\u0000\u0000\u001c\u0082\u0001\u0000\u0000"+
		"\u0000\u001e\u0084\u0001\u0000\u0000\u0000 \u0086\u0001\u0000\u0000\u0000"+
		"\"\u008a\u0001\u0000\u0000\u0000$\u008f\u0001\u0000\u0000\u0000&\u0097"+
		"\u0001\u0000\u0000\u0000(\u009b\u0001\u0000\u0000\u0000*\u009d\u0001\u0000"+
		"\u0000\u0000,.\u0003\u0006\u0003\u0000-/\u0003\u0002\u0001\u0000.-\u0001"+
		"\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u0000"+
		"01\u0003\n\u0005\u00001\u0001\u0001\u0000\u0000\u000024\u0003\u0004\u0002"+
		"\u000032\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u000053\u0001\u0000"+
		"\u0000\u000056\u0001\u0000\u0000\u00006\u0003\u0001\u0000\u0000\u0000"+
		"78\u0005\u0007\u0000\u000089\u0005\u000f\u0000\u00009:\u0005\u0013\u0000"+
		"\u0000:;\u0007\u0000\u0000\u0000;<\u0005\t\u0000\u0000<=\u0005\r\u0000"+
		"\u0000=\u0005\u0001\u0000\u0000\u0000>?\u0005\n\u0000\u0000?@\u0003\b"+
		"\u0004\u0000@A\u0005\r\u0000\u0000A\u0007\u0001\u0000\u0000\u0000BC\u0005"+
		"\u000f\u0000\u0000C\t\u0001\u0000\u0000\u0000DF\u0003\f\u0006\u0000ED"+
		"\u0001\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000"+
		"\u0000GH\u0001\u0000\u0000\u0000H\u000b\u0001\u0000\u0000\u0000IG\u0001"+
		"\u0000\u0000\u0000JM\u0003\u000e\u0007\u0000KM\u0003\u0014\n\u0000LJ\u0001"+
		"\u0000\u0000\u0000LK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000"+
		"NO\u0005\r\u0000\u0000O\r\u0001\u0000\u0000\u0000PQ\u0003\u0012\t\u0000"+
		"QR\u0005\u0011\u0000\u0000RU\u0003\u0010\b\u0000ST\u0005\f\u0000\u0000"+
		"TV\u0003*\u0015\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000"+
		"V\u000f\u0001\u0000\u0000\u0000WX\u0005\u000e\u0000\u0000X\u0011\u0001"+
		"\u0000\u0000\u0000YZ\u0005\u000f\u0000\u0000Z\u0013\u0001\u0000\u0000"+
		"\u0000[]\u0003\u001c\u000e\u0000\\^\u0003 \u0010\u0000]\\\u0001\u0000"+
		"\u0000\u0000]^\u0001\u0000\u0000\u0000^`\u0001\u0000\u0000\u0000_a\u0003"+
		"\"\u0011\u0000`_\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ab\u0001"+
		"\u0000\u0000\u0000bc\u0005\u0011\u0000\u0000cd\u0003\u0016\u000b\u0000"+
		"d\u0015\u0001\u0000\u0000\u0000ej\u0003\u0018\f\u0000fg\u0005\u0012\u0000"+
		"\u0000gi\u0003\u0018\f\u0000hf\u0001\u0000\u0000\u0000il\u0001\u0000\u0000"+
		"\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000k\u0017\u0001"+
		"\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000mo\u0003\u001a\r\u0000nm\u0001"+
		"\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000"+
		"pq\u0001\u0000\u0000\u0000q\u0019\u0001\u0000\u0000\u0000rs\u0003(\u0014"+
		"\u0000st\u0005\u0013\u0000\u0000tv\u0001\u0000\u0000\u0000ur\u0001\u0000"+
		"\u0000\u0000uv\u0001\u0000\u0000\u0000vz\u0001\u0000\u0000\u0000w{\u0003"+
		"\u0012\t\u0000x{\u0003\u001c\u000e\u0000y{\u0003\u001e\u000f\u0000zw\u0001"+
		"\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000zy\u0001\u0000\u0000\u0000"+
		"{}\u0001\u0000\u0000\u0000|~\u0005\b\u0000\u0000}|\u0001\u0000\u0000\u0000"+
		"}~\u0001\u0000\u0000\u0000~\u0080\u0001\u0000\u0000\u0000\u007f\u0081"+
		"\u0005\t\u0000\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0080\u0081\u0001"+
		"\u0000\u0000\u0000\u0081\u001b\u0001\u0000\u0000\u0000\u0082\u0083\u0005"+
		"\u0010\u0000\u0000\u0083\u001d\u0001\u0000\u0000\u0000\u0084\u0085\u0005"+
		"\u0006\u0000\u0000\u0085\u001f\u0001\u0000\u0000\u0000\u0086\u0087\u0005"+
		"\u0001\u0000\u0000\u0087\u0088\u0003$\u0012\u0000\u0088\u0089\u0005\u0002"+
		"\u0000\u0000\u0089!\u0001\u0000\u0000\u0000\u008a\u008b\u0005\f\u0000"+
		"\u0000\u008b\u008c\u0005\u0003\u0000\u0000\u008c\u008d\u0003$\u0012\u0000"+
		"\u008d\u008e\u0005\u0004\u0000\u0000\u008e#\u0001\u0000\u0000\u0000\u008f"+
		"\u0094\u0003&\u0013\u0000\u0090\u0091\u0005\u0005\u0000\u0000\u0091\u0093"+
		"\u0003&\u0013\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0093\u0096\u0001"+
		"\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0095\u0001"+
		"\u0000\u0000\u0000\u0095%\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000"+
		"\u0000\u0000\u0097\u0098\u0005\u0010\u0000\u0000\u0098\u0099\u0005\u0011"+
		"\u0000\u0000\u0099\u009a\u0005\u000f\u0000\u0000\u009a\'\u0001\u0000\u0000"+
		"\u0000\u009b\u009c\u0005\u0010\u0000\u0000\u009c)\u0001\u0000\u0000\u0000"+
		"\u009d\u009e\u0005\u000b\u0000\u0000\u009e+\u0001\u0000\u0000\u0000\u000e"+
		".5GLU]`jpuz}\u0080\u0094";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}