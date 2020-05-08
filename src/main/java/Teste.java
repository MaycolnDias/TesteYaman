import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Teste {

	private static Carro fusca = new Carro("Preto", "Cruze", 150.0);
	private static Boolean ligaDesliga = true;
	private static Double quantidade = 80.0;
	
	/* 
	 * Testando se o modelo do carro é o mesmo inserido
	 * na criação do objeto.
	 */
	@Test
	public void testeModeloCarro() {	
		Assertions.assertEquals("Cruze", fusca.getModelo(),"Errou");
		
	}
	@BeforeAll
	public static void testeLigaDesligaCarro() {
		if (fusca.ligaedesliga(ligaDesliga)) {
			System.out.println(fusca.getLigado());
			//fusca.acelera(60.0);
		}
	}
	/*
	 * Testando se o método LigaDesliga do objeto Carro
	 * 
	 */
	@Test
	public void testeLigaCarro() {
			Assertions.assertTrue(fusca.getLigado(),"Falso");
	}
	
	@BeforeAll
    public static void aceleraCarro() {
        Double velocidadeNova = fusca.velocidadeAtual + quantidade;
        if (velocidadeNova < fusca.velocidadeMaxima){
            fusca.velocidadeAtual = velocidadeNova;
        }
	}
    @Test   
    public void testeVelocidadeCarro() {
        	
        	Assertions.assertEquals(80.0,fusca.getVelocidadeAtual(), "Valor Divergente do esperado");
        	
        }
    
}