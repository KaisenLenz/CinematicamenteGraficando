// Generated from C:\Users\Kaisen\Documents\NetBeansProjects\proyectotalf\src\proyectotalf\simple.g4 by ANTLR 4.8

    package proyectotalf;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link simpleParser}.
 */
public interface simpleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link simpleParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(simpleParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(simpleParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#consultas}.
	 * @param ctx the parse tree
	 */
	void enterConsultas(simpleParser.ConsultasContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#consultas}.
	 * @param ctx the parse tree
	 */
	void exitConsultas(simpleParser.ConsultasContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#mru_cuerpo}.
	 * @param ctx the parse tree
	 */
	void enterMru_cuerpo(simpleParser.Mru_cuerpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#mru_cuerpo}.
	 * @param ctx the parse tree
	 */
	void exitMru_cuerpo(simpleParser.Mru_cuerpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#mrua_cuerpo}.
	 * @param ctx the parse tree
	 */
	void enterMrua_cuerpo(simpleParser.Mrua_cuerpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#mrua_cuerpo}.
	 * @param ctx the parse tree
	 */
	void exitMrua_cuerpo(simpleParser.Mrua_cuerpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#caida_cuerpo}.
	 * @param ctx the parse tree
	 */
	void enterCaida_cuerpo(simpleParser.Caida_cuerpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#caida_cuerpo}.
	 * @param ctx the parse tree
	 */
	void exitCaida_cuerpo(simpleParser.Caida_cuerpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#lva_cuerpo}.
	 * @param ctx the parse tree
	 */
	void enterLva_cuerpo(simpleParser.Lva_cuerpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#lva_cuerpo}.
	 * @param ctx the parse tree
	 */
	void exitLva_cuerpo(simpleParser.Lva_cuerpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#lvab_cuerpo}.
	 * @param ctx the parse tree
	 */
	void enterLvab_cuerpo(simpleParser.Lvab_cuerpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#lvab_cuerpo}.
	 * @param ctx the parse tree
	 */
	void exitLvab_cuerpo(simpleParser.Lvab_cuerpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(simpleParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(simpleParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(simpleParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(simpleParser.VariableContext ctx);
}