// Generated from simple.g4 by ANTLR 4.8

    package proyectotalf;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link simpleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface simpleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link simpleParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(simpleParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#consultas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsultas(simpleParser.ConsultasContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#mru_cuerpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMru_cuerpo(simpleParser.Mru_cuerpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#mrua_cuerpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMrua_cuerpo(simpleParser.Mrua_cuerpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#caida_cuerpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaida_cuerpo(simpleParser.Caida_cuerpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#lva_cuerpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLva_cuerpo(simpleParser.Lva_cuerpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#lvab_cuerpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLvab_cuerpo(simpleParser.Lvab_cuerpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(simpleParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(simpleParser.VariableContext ctx);
}