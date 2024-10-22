package net.originmobi.pdv.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BancoTest {
	
	
	@Test
	public void teste() {
		BancoController bancoController = new BancoController();
		assertEquals(bancoController.testeRequisicao(), "Requisicao concluida com sucesso");
		
	}
}
