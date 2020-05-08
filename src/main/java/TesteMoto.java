import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TesteMoto {

	public static Moto moto = new Moto("Verde", "CG", 300);
	public static Integer marcha = 2;
	public static Boolean roubo = true;

	@Test
	public void testeModelo() {
		Assertions.assertEquals("CG", moto.getModelo(), "Modelo diferente");
	}

	@BeforeAll
	public static void marcha() {
		if (marcha < 6 && marcha != moto.marcha) {
			moto.marcha = marcha;
			moto.velocidadeAtual = marcha * 35.0;
		} else {
			System.out.println("Não é possível trocar para a mesma marcha ou exceder 5 marchas!");
		}
	}

	@Test
	public void testeVelocidade1() {
		Assertions.assertEquals(70.0, moto.getVelocidadeAtual(), "Valor errado");
	}

	@Test
	public void testeMarcha() {
		Assertions.assertEquals(2, moto.getMarcha(), "Marcha diferente da apontada!");
	}
}