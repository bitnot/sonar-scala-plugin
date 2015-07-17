package com.stratio.sonar.colorization;

import com.sonar.sslr.api.AstNode;
import com.sonar.sslr.api.TokenType;
import org.sonar.sslr.grammar.GrammarRuleKey;

public enum ScalaPunctuator implements TokenType, GrammarRuleKey {

	LCURLYBRACE("{"),
	RCURLYBRACE("}"),
	LPARENTHESIS("("),
	RPARENTHESIS(")"),
	LBRACKET("["),
	RBRACKET("]"),
	DOT("."),
	DOUBLEARROW("=>"),
	ELLIPSIS("..."),
	SEMI(";"),
	COMMA(","),
	LT("<"),
	GT(">"),
	LE("<="),
	GE(">="),
	EQUAL("=="),
	NOTEQUAL("!="),
	EQUAL2("==="),
	NOTEQUAL2("!=="),
	PLUS("+"),
	MINUS("-"),
	STAR("*"),
	MOD("%"),
	DIV("/"),
	INC("++"),
	DEC("--"),
	SL("<<"),
	SR(">>"),
	SR2(">>>"),
	AND("&"),
	OR("|"),
	XOR("^"),
	ANG("!"),
	TILDA("~"),
	ANDAND("&&"),
	OROR("||"),
	QUERY("?"),
	COLON(":"),
	EQU("="),
	PLUS_EQU("+="),
	MINUS_EQU("-="),
	DIV_EQU("/="),
	STAR_EQU("*="),
	MOD_EQU("%="),
	SL_EQU("<<="),
	SR_EQU(">>="),
	SR_EQU2(">>>="),
	AND_EQU("&="),
	OR_EQU("|="),
	XOR_EQU("^=");
	
	private final String value;
	
	private ScalaPunctuator(String word) {
		this.value = word;
	}

	@Override
	public String getName() {
		return name();
	}

	@Override
	public String getValue() {
		return value;
	}

	@Override
	public boolean hasToBeSkippedFromAst(AstNode node) {
		return false;
	}

}
