package br.com.alura.loja;

import br.com.alura.loja.http.HttpAdapter;
import br.com.alura.loja.http.HttpAdapterClient;
import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.orcamento.RegistroDeOrcamento;

import java.math.BigDecimal;
import java.math.BigInteger;

public class TestesAdapter {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(new BigDecimal(BigInteger.TEN)
        ));
        orcamento.aprovar();
        orcamento.finalizar();

        RegistroDeOrcamento registroDeOrcamento = new RegistroDeOrcamento(new HttpAdapterClient());
        registroDeOrcamento.registrar(orcamento);

    }
}
