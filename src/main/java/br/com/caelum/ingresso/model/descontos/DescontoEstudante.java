package br.com.caelum.ingresso.model.descontos;

import java.math.BigDecimal;

public class DescontoEstudante implements Desconto{

	@Override
	public BigDecimal aplicarDescontoSobre(BigDecimal precoOriginal) {
		return precoOriginal.divide(new BigDecimal("2"));
	}

	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return "Estudante";
	}

}
