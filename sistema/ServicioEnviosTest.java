package sistema;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ServicioEnviosTest {

	@Test
	void testpaquetePesoNegativo() {
		PaqueteEnviado paq=new PaqueteEnviado("Francia",-1.0,"estandar");
		calcularCosteEnvio(paq.getClass());
		agregarTarifapais(paq.getPaisDestino(),paq.getTipoServicio());
		throw new IllegalArgumentException("El paquete no puede tener un peso negativo");
	}
	@Test
	void testpaqueteEnvioNulo() {
		PaqueteEnviado paq=new PaqueteEnviado("Francia",0.0,null);
		calcularCosteEnvio(paq.getClass());
		agregarTarifapais(paq.getPaisDestino(),paq.getTipoServicio());
		throw new IllegalArgumentException("El tipo de servicio no puede estar vacío.");
	}
	@Test
	void testpaqueteNulo() {
		PaqueteEnviado paq=new PaqueteEnviado(null,0.0,"estandar");
		calcularCosteEnvio(paq.getClass());
		agregarTarifapais(paq.getPaisDestino(),paq.getTipoServicio());
		throw new IllegalArgumentException("El paquete no puede ser null.");
	}
	@Test
	void testpaqueteSuperaPeso() {
		PaqueteEnviado paq=new PaqueteEnviado("Francia",11.0,"estandar");
		calcularCosteEnvio(paq.getClass());
		agregarTarifapais(paq.getPaisDestino(),paq.getTipoServicio());
	}
	

}
