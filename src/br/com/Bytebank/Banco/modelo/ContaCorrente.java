package br.com.Bytebank.Banco.modelo;
public class ContaCorrente extends Conta implements Tributavel {
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void saca(double valor) throws SaldoInsuficienteException { // assinatura igual
		double valorASacar = valor + 0.2;
		super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}

	@Override
	public double getValorImposto() {
		return super.saldo *0.01;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Conta Corrente " + super.toString();
	}
	
}
