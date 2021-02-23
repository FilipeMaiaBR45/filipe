package Questao2;

public class Pedido {
	private String nomeCliente;
	private String horaCompra;
	private String endEntrega;
	private int qtdButijao;
	private float valorTotal;
	private String horaEntrega;
	private String formadPagamento;
	private String statusPedido;
	private int numeroPedido;
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getHoraCompra() {
		return horaCompra;
	}
	public void setHoraCompra(String horaCompra) {
		this.horaCompra = horaCompra;
	}
	public String getEndEntrega() {
		return endEntrega;
	}
	public void setEndEntrega(String endEntrega) {
		this.endEntrega = endEntrega;
	}
	public int getQtdButijao() {
		return qtdButijao;
	}
	public void setQtdButijao(int qtdButijao) {
		this.qtdButijao = qtdButijao;
	}
	public float getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}
	public String getHoraEntrega() {
		return horaEntrega;
	}
	public void setHoraEntrega(String horaEntrega) {
		this.horaEntrega = horaEntrega;
	}
	public String getFormadPagamento() {
		return formadPagamento;
	}
	public void setFormadPagamento(String formadPagamento) {
		this.formadPagamento = formadPagamento;
	}
	public String getStatusPedido() {
		return statusPedido;
	}
	public int getNumeroPedido() {
		return numeroPedido;
	}
	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}
	
	public void situacaoPedido() {
		if(this.getFormadPagamento() != null)
			this.statusPedido = "Preparando para entrega.";
		else
			this.statusPedido = "Aguardando confirmaçao do pedido.";
	}
	}