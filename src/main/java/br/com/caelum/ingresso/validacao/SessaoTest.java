package br.com.caelum.ingresso.validacao;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalTime;

import org.junit.Test;

import br.com.caelum.ingresso.model.Filme;
import br.com.caelum.ingresso.model.Sala;
import br.com.caelum.ingresso.model.Sessao;
import junit.framework.Assert;

public class SessaoTest {
	
	@Test
	public void oPrecoDaSessaoDeveSerIgualASomaDoPrecoDaSalaMaisOPrecoDoFilme(){
		
		Filme filme = new Filme("Filme Teste", Duration.ofMinutes(120), "SCI-FI", new BigDecimal("22.5"));
		
		Sala sala = new Sala("Eldorado = IMAX", new BigDecimal("12.0"));
		
		Sessao sessao = new Sessao(LocalTime.parse("13:00:00"), filme, sala);
		
		BigDecimal somaDosPrecos = sala.getPreco().add(filme.getPreco());
		
		
		Assert.assertEquals(somaDosPrecos, sessao.getPreco());
		
		
		
	}

}
