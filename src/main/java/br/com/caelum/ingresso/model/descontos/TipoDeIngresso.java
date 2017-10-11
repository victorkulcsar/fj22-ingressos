package br.com.caelum.ingresso.model.descontos;

import java.math.BigDecimal;

public enum TipoDeIngresso {
	
	INTEIRO(new SemDesconto()),
	ESTUDANTE(new DescontoEstudante()),
	BANCO(new DescontoTrintaPorCentoParaBancos());
	
	private final Desconto desconto;
	
	TipoDeIngresso(Desconto desconto)
	{
		this.desconto = desconto;
	}
	
	public BigDecimal aplicaDesconto(BigDecimal valor){
		return desconto.aplicarDescontoSobre(valor);
		
	}
	
	public String getDescricao(){
		return desconto.getDescricao();
		
	}

	public BigDecimal aplicarDescontoSobre(BigDecimal preco) {
				return desconto.aplicarDescontoSobre(preco);
	}
}
