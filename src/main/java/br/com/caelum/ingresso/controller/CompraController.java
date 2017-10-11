package br.com.caelum.ingresso.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.caelum.ingresso.dao.LugarDao;
import br.com.caelum.ingresso.dao.SessaoDao;
import br.com.caelum.ingresso.model.Carrinho;
import br.com.caelum.ingresso.model.form.CarrinhoForm;

public class CompraController {
	
	private SessaoDao sessaoDao;
	
	private LugarDao lugarDao;
	
	private Carrinho carrinho;
	
	@PostMapping("/compra/ingressos")
	public ModelAndView enviarParaPagamento(CarrinhoForm carrinhoForm){
		ModelAndView modelAndView = new ModelAndView("redirect:/compra");
		
		carrinhoForm.toIngressos(sessaoDao, lugarDao).forEach(carrinho::add);
		
		return modelAndView;
		
	}

}
