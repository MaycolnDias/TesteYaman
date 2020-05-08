
public class Moto {

	public String cor;
	public String modelo;
	public Integer cilindradas;
	public Integer anoLancamento;
	public Double velocidadeAtual;
	public Integer marcha = 0;

	public Moto(String cor, String modelo, Integer cilindradas) {
		this.cor = cor;
		this.modelo = modelo;
		this.cilindradas = cilindradas;

	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public Integer getCilindradas() {
		return cilindradas;
	}

	public Integer getAnoLancamento() {
		return anoLancamento;
	}
	public Double getVelocidadeAtual() {
		return this.velocidadeAtual;
	}
	
	public void setVelocidadeAtual(Double velocidade) {
		this.velocidadeAtual = velocidade;
	}

	public void setAnoLancamento(Integer anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	
	public Integer getMarcha () {
		return this.marcha;
	}

	public void botaoAlarme(Boolean roubo) {
		if (roubo) {
			System.out.println("Esse veículo está sendo roubado e é monitorado pela CAR SISTEM!");
			this.velocidadeAtual = 0.0;
		}
	}

	public void marcha(Integer marcha) {
		if(marcha < 6 && marcha != this.marcha) {
		this.velocidadeAtual = marcha * 35.0;
		this.marcha = marcha;
		} else {
			System.out.println("Não é possível trocar para a mesma marcha ou exceder 5 marchas!");
		}
	}

}
